package com.kodilla.notification.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class WeatherAlertTestSuite {

    WeatherAlert weatherAlert = new WeatherAlert();
    Location locationOne = Mockito.mock(Location.class);
    Location locationTwo = Mockito.mock(Location.class);
    Location locationThree = Mockito.mock(Location.class);

    User userOne = Mockito.mock(User.class);
    User userTwo = Mockito.mock(User.class);
    User userThree = Mockito.mock(User.class);

    Notification notification = Mockito.mock(Notification.class);

    @Test
    public void shouldSendNotificationToUsers() {
        weatherAlert.addWeatherUser(userOne, locationOne);
        weatherAlert.addWeatherUser(userTwo, locationTwo);
        weatherAlert.sendNotificationToAllUsers();

        Mockito.verify(userOne, Mockito.times(1)).receiveServiceNotification();
        Mockito.verify(userTwo, Mockito.times(1)).receiveServiceNotification();
    }

    @Test
    public void userShouldRemoveSubLocation(){
        weatherAlert.addWeatherUser(userOne, locationOne);
        weatherAlert.addWeatherUser(userTwo, locationTwo);
        weatherAlert.removeSubscriptionFromLocation(userTwo, locationTwo);
        weatherAlert.sendNotificationToAllUsers();

        Mockito.verify(userTwo, Mockito.never()).receiveServiceNotification();
    }

    @Test
    public void userCanRemoveAllLocationSub(){
        weatherAlert.addWeatherUser(userOne, locationOne);
        weatherAlert.addWeatherUser(userTwo, locationTwo);
        weatherAlert.addWeatherUser(userTwo, locationTwo);
        weatherAlert.addWeatherUser(userTwo, locationThree);
        weatherAlert.addWeatherUser(userThree, locationThree);
        weatherAlert.addWeatherUser(userThree, locationOne);
        weatherAlert.removeSubscription(userTwo);
        weatherAlert.sendNotificationToAllUsers();

        Mockito.verify(userOne, Mockito.times(1)).receiveServiceNotification();
        Mockito.verify(userTwo, Mockito.never()).receiveServiceNotification();
        Mockito.verify(userThree, Mockito.times(2)).receiveServiceNotification();
    }

    @Test
    public void usersShouldGetAlertByLocation(){
        weatherAlert.addWeatherUser(userOne, locationThree);
        weatherAlert.addWeatherUser(userTwo, locationTwo);
        weatherAlert.addWeatherUser(userTwo, locationThree);
        weatherAlert.addWeatherUser(userThree, locationOne);
        weatherAlert.sendNotificationToAllUsersByLocation(locationThree);
        weatherAlert.sendNotificationToAllUsersByLocation(locationTwo);

        Mockito.verify(userOne, Mockito.times(1)).receiveAlertLocation();
        Mockito.verify(userTwo, Mockito.times(2)).receiveAlertLocation();
        Mockito.verify(userThree, Mockito.never()).receiveAlertLocation();
    }


    @Test
    public void shouldRemoveLocationFromUsers(){
        weatherAlert.addWeatherUser(userOne, locationOne);
        weatherAlert.addWeatherUser(userTwo, locationTwo);
        weatherAlert.removeLocation(locationTwo);
        weatherAlert.sendNotificationToAllUsers();

        Mockito.verify(userOne, Mockito.times(1)).receiveServiceNotification();
        Mockito.verify(userTwo, Mockito.never()).receiveServiceNotification();
    }
}