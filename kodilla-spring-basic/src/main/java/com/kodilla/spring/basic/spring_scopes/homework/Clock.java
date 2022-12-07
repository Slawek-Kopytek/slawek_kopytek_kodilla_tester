package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@Scope("prototype")
public class Clock {

    LocalTime localTime;

    public Clock(){
        this.localTime = LocalTime.now();
        System.out.println(localTime);
    }

    public LocalTime getLocalTime(){
        return localTime;
    }
}
