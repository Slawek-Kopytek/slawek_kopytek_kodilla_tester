package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("12"));
        warehouse.addOrder(new Order("23"));
        warehouse.addOrder(new Order("123"));

        try {
            Order isOrderInWarehouse = warehouse.getOrder("1");
            System.out.println("Order prepared: " + isOrderInWarehouse);
        } catch (OrderDoesntExistException e) {
            System.out.println("Yours order doesn't exist in ours system");
        } finally {
            System.out.println("Thank you");
        }
    }
}
