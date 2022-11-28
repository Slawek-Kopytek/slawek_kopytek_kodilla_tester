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
        weatherAlert.sendNotificationByLocation(userOne, locationOne);
        weatherAlert.sendNotificationByLocation(userThree, locationThree);
        weatherAlert.sendToAllUsersNotification(notification);

        Mockito.verify(userOne).receive(notification);
        Mockito.verify(userThree).receive(notification);
    }

    @Test
    public void userShouldRemoveSubLocation(){
        weatherAlert.sendNotificationByLocation(userOne, locationOne);
        weatherAlert.removeSubscriptionFromLocation(userOne, locationOne);
        weatherAlert.sendToAllUsersNotification(notification);

        Mockito.verify(userOne, Mockito.never()).receive(notification);
    }

    @Test
    public void userCanRemoveSubAllLocation(){
        weatherAlert.sendNotificationByLocation(userOne, locationOne);
        weatherAlert.sendNotificationByLocation(userOne, locationTwo);
        weatherAlert.sendNotificationByLocation(userOne, locationThree);
        weatherAlert.removeLocation(locationOne);
        weatherAlert.removeLocation(locationTwo);
        weatherAlert.removeLocation(locationThree);
        weatherAlert.sendToAllUsersNotification(notification);

        Mockito.verify(userOne, Mockito.never()).receive(notification);
    }

    @Test
    public void usersWithLocationShouldReceiveNotification(){
        weatherAlert.sendNotificationByLocation(userOne, locationOne);
        weatherAlert.sendNotificationByLocation(userTwo, locationTwo);
        weatherAlert.sendNotificationByLocation(userThree, locationThree);
        weatherAlert.alertForLocation(locationOne, notification);
        weatherAlert.alertForLocation(locationThree, notification);

        Mockito.verify(userOne).receive(notification);
        Mockito.verify(userThree).receive(notification);
        Mockito.verify(userTwo, Mockito.never()).receive(notification);
    }

    @Test
    public void shouldRemoveUserFromNotification(){
        weatherAlert.sendNotificationByLocation(userOne, locationOne);
        weatherAlert.sendNotificationByLocation(userOne, locationTwo);
        weatherAlert.alertForLocation(locationOne, notification);

        Mockito.verify(userOne, Mockito.times(1)).receive(notification);

        weatherAlert.removeSubscription(userOne);
        weatherAlert.sendToAllUsersNotification(notification);

        Mockito.verify(userOne, Mockito.never()).receive(notification);

    }

    @Test
    public void shouldAddElementToMap(){
        weatherAlert.addWeatherUser(userOne, locationThree);

        weatherAlert.sendToAllUsersNotification(notification);

        Mockito.verify(userOne, Mockito.times(1)).receive(notification);
    }
}