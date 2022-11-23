package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {
    private  Set<Order> orders = new HashSet<>();

    public void addOrder(Order order){
        this.orders.add(order);
    }

    public Set<Order> getOrdersByPeriod(LocalDate dateFrom, LocalDate dateTo){
        return orders
                .stream()
                .filter(n -> n.getDate().isAfter(dateFrom.minusMonths(5)))
                .filter(n -> n.getDate().isBefore(dateTo.plusMonths(5)))
                .collect(Collectors.toSet());
    }

    public Set<Order> getOrdersByMinAndMaxValue(double min, double max){
        return orders
                .stream()
                .filter(n -> n.getValue() >= min)
                .filter(n -> n.getValue() <= max)
                .collect(Collectors.toSet());
    }

    public int getSizeOfOrders(){
        return this.orders.size();
    }

    public double sumOfOrders(){
        return orders
                .stream()
                .mapToDouble(Order::getValue)
                .sum();
    };
}
