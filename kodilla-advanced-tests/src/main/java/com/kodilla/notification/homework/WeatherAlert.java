package com.kodilla.notification.homework;

import java.util.*;

public class WeatherAlert {

    private Map<Location, Set<User>> usersAlert = new HashMap<>();

    //1
    public void alertForLocation(Location location, Notification notification){
        usersAlert.getOrDefault(location, new HashSet<>())
                .forEach(user -> user.receive(notification));
    }

    //2
    public void removeLocation(Location location){
        usersAlert.remove(location);
    }

    //3
    public void removeSubscription(User user){
        for (Map.Entry<Location, Set<User>> entry : usersAlert.entrySet()){
            entry.getValue().remove(user);
        }
    }

    //4
    public void sendNotificationByLocation(User user, Location location){
        if (!usersAlert.containsKey(location)){
            usersAlert.put(location, new HashSet<>());
        }
        usersAlert.get(location).add(user);
    }

    //5
    public void sendToAllUsersNotification(Notification notification){
        for (Map.Entry<Location, Set<User>> entry : usersAlert.entrySet()){
            entry.getValue().forEach(user -> user.receive(notification));
        }
    }

    //6
    public void removeSubscriptionFromLocation(User user, Location location){
        if(!usersAlert.containsKey(location)){
            usersAlert.put(location, new HashSet<>());
        }
        usersAlert.get(location).remove(user);
    }
}
