package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {
    private  Set<Order> orders = new HashSet<>();

    //0
    public void addOrder(Order order){
        this.orders.add(order);
    }

    //1
    public Set<Order> getOrder(Order order) {
        return orders
                .stream()
                .filter(n -> Boolean.parseBoolean(n.getLogin()))
                .collect(Collectors.toSet());
    }

    //2
    public Set<Order> getOrdersByPeriod(LocalDate dateFrom, LocalDate dateTo){
        return orders
                .stream()
                .filter(n -> n.getDate().isAfter(dateFrom.minusMonths(5)))
                .filter(n -> n.getDate().isBefore(dateTo.plusMonths(5)))
                .collect(Collectors.toSet());
    }

    //3
    public Set<Order> getOrdersByMinAndMaxValue(double min, double max){
        return orders
                .stream()
                .filter(n -> n.getValue() >= min)
                .filter(n -> n.getValue() <= max)
                .collect(Collectors.toSet());
    }

    //4
    public int getSizeOfOrders(){
        return this.orders.size();
    }

    //5
    public double sumOfOrders(){
        double sum = 0;
        for (Order order : this.orders)
            sum += order.getValue();
        return sum;
    };
}
