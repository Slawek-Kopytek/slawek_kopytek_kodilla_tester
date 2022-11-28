package com.kodilla.notification.homework;

import java.util.*;

public class WeatherAlert {

    private Map<Location, Set<User>> usersAlert = new HashMap<>();

    public void alertForLocation(Location location, Notification notification){
        usersAlert.getOrDefault(location, new HashSet<>())
                .forEach(user -> user.receive(notification));
    }

    public void removeLocation(Location location){
        usersAlert.remove(location);
    }

    public void removeSubscription(User user){
        for (Map.Entry<Location, Set<User>> entry : usersAlert.entrySet()){
            entry.getValue().remove(user);
        }
    }

    public void sendNotificationByLocation(User user, Location location){
        if (!usersAlert.containsKey(location)){
            usersAlert.put(location, new HashSet<>());
        }
        usersAlert.get(location).add(user);
    }

    public void sendToAllUsersNotification(Notification notification){
        for (Map.Entry<Location, Set<User>> entry : usersAlert.entrySet()){
            entry.getValue().forEach(user -> user.receive(notification));
        }
    }

    public void removeSubscriptionFromLocation(User user, Location location){
        if(!usersAlert.containsKey(location)){
            usersAlert.put(location, new HashSet<>());
        }
        usersAlert.get(location).remove(user);
    }

    public void addWeatherUser(User user, Location location){
        Set<User> users = usersAlert.getOrDefault(location, new HashSet<>());
        users.add(user);
        usersAlert.put(location, users);
    }
}
