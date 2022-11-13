package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;


public class Warehouse {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order){
        orders.add(order);
        System.out.println(order + " order added");
    }

    public Order getOrder(String number) throws OrderDoesntExistException{
        return orders
                .stream()
                .filter(n -> n.getNumber().equals(number))
                .findFirst()
                .orElseThrow(OrderDoesntExistException::new);
    }
}
