package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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
