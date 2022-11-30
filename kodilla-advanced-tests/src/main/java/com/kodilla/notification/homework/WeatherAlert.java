package com.kodilla.notification.homework;

import java.util.*;

public class WeatherAlert {

    private Map<Location, Set<User>> usersAlert = new HashMap<>();

    public void addWeatherUser(User user, Location location) {
        if (usersAlert.containsKey(location)){
            usersAlert.get(location).add(user);
        } else {
            Set<User> newUser = new HashSet<>();
            newUser.add(user);
            usersAlert.put(location, newUser);
        }
    }

    public void removeSubscriptionFromLocation(User user, Location location){
        usersAlert.get(location).remove(user);
    }

    public void removeSubscription(User user){
        for (Map.Entry<Location, Set<User>> entry : usersAlert.entrySet()){
            entry.getValue().remove(user);
        }
    }

    public void sendNotificationToAllUsersByLocation(Location location){
        if (usersAlert.containsKey(location))
            usersAlert.get(location).forEach(User::receiveAlertLocation);
    }

    public void sendNotificationToAllUsers(){
        for (Set<User> users : usersAlert.values())
            users.forEach(User::receiveServiceNotification);
    }

    public void removeLocation(Location location){
        usersAlert.remove(location);
    }
}
