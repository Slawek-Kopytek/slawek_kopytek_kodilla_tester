package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ForkJoinWorkerThread;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    public void testIsOrderInWarehouse() throws OrderDoesntExistException{
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        //when
        Order result = warehouse.getOrder("1");
        //then
        Order expectedOrder = new Order("1");
        assertEquals(result.getNumber(), expectedOrder.getNumber());
    }

    @Test
    public void testIsOrderInWarehouse_withException(){
        Warehouse warehouse = new Warehouse();
        //then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("2"));
    }
}