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
        Order result = new Order("1");
        //then
        assertEquals(result.getNumber(), Warehouse.getOrder("1").getNumber());
    }

    @Test
    public void testIsOrderInWarehouse_withException(){
        //Warehouse warehouse = new Warehouse();
        //then
        assertThrows(OrderDoesntExistException.class, () -> Warehouse.getOrder("2"));
    }
}