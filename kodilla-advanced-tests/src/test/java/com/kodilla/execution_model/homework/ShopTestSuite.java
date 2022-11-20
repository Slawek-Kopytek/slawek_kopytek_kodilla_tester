package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {
    Shop shop = new Shop();

    Order lightbulb = new Order(75.5, LocalDate.of(2022,7,13), "Mateusz");
    Order chairs = new Order(249.99, LocalDate.of(2022,9,20), "Anna");
    Order sofa = new Order(1200.15, LocalDate.of(2021, 1,4), "Tomek");
    Order TV = new Order(999.99, LocalDate.of(2022,1,10), "Kasia");
    Order bed = new Order(349.99, LocalDate.of(2022,12,30), "Bartek");

    @Test
    public void shouldCalculateOrdersAddedToShop(){
        //when
        int result = shop.getSizeOfOrders();
        //then
        assertEquals(5, result);
    }

    @Test
    public void shouldReturnAllOrdersByPeriod(){
        //when
        Set<Order> result = shop.getOrdersByPeriod(LocalDate.of(2022,11,25), LocalDate.of(2022,11,20));
        //then
        assertEquals(3, result.size());
    }

    @Test
    public void shouldReturnMinAndMaxValue(){
        //when
        Set<Order> result = shop.getOrdersByMinAndMaxValue(249.99, 999.99);
        //then
        assertEquals(3, result.size());
    }


    @Test
    public void shouldReturnWholeSumOfOrders(){
        //when
        double result = shop.sumOfOrders();
        //then
        assertEquals(2875.62, result);
    }

    @BeforeEach
    public void initializeInvoice() {
        shop.addOrder(lightbulb);
        shop.addOrder(chairs);
        shop.addOrder(sofa);
        shop.addOrder(TV);
        shop.addOrder(bed);
    }

    @AfterEach
    public void resettingValue(){
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }
    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }
}