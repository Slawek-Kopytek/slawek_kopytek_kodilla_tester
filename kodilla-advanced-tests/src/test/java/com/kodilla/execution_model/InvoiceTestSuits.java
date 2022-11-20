package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class InvoiceTestSuits {
    Invoice invoice = new Invoice();
    Item carRent = new Item ("FV12", 1500);
    Item flatRent = new Item("Fv20", 2000);
    Item sportCard = new Item("FV1", 50);
    Item mediaSubscriptions = new Item("FV7", 150);

    @Test
    public void shouldAddItemToInvoice(){
        //when
        int numberOfItems = invoice.getSize();
        //then
        assertEquals(4, numberOfItems);
    }

    @Test
    public void shouldGetExistingItem(){
        //when
        Item result = invoice.getItem(3);
        //then
        assertEquals("FV7", result.getName());
        assertEquals(150, result.getPrice());
    }

    @Test
    public void shouldReturnNullWhenPassingNegativeIndex(){
        //when
        Item result = invoice.getItem(-1);
        //then
        assertNull(result);
    }

    @Test
    public void shouldReturnNullWhenPassingOutOfRangeIndex() {
        //when
        Item result = invoice.getItem(5);
        //then
        assertNull(result);
    }

    @Test
    public void shouldClearInvoice(){
        //given
        int invoiceSizeBeforeClear = invoice.getSize();
        //when
        invoice.clear();
        //then
        assertEquals(0, invoice.getSize());
        assertEquals(4, invoiceSizeBeforeClear);
    }

    @BeforeEach
    public void initializeInvoice(){
        invoice.addItem(carRent);
        invoice.addItem(flatRent);
        invoice.addItem(sportCard);
        invoice.addItem(mediaSubscriptions);
    }

    @AfterEach
    public void resetValue(){
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage(){
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage(){
        System.out.println("Finishing testing");
    }
}