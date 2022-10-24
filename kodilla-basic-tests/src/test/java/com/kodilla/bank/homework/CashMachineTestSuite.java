package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();

        int[] transactions = cashMachine.getDeals();
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldGetNumberOfDeal() {
        CashMachine cashMachine = new CashMachine();

        cashMachine.add(750);
        cashMachine.add(1000);
        cashMachine.add(-1200);
        cashMachine.add(-100);

        int[] deals = cashMachine.getDeals();
        assertEquals(4, deals.length);
    }

    @Test
    public void shouldGetBalance() {
        CashMachine cashMachine = new CashMachine();

        cashMachine.add(750);
        cashMachine.add(1000);
        cashMachine.add(-1200);
        cashMachine.add(-100);

        assertEquals(450, cashMachine.getBalance());
    }

    @Test
    public void shouldGetNumberOfPayouts() {
        CashMachine cashMachine = new CashMachine();

        cashMachine.add(-200);
        cashMachine.add(1200);

        assertEquals(1, cashMachine.getNumberOfPayouts());
    }

    @Test
    public void shouldGetNumberOfDeposits() {
        CashMachine cashMachine = new CashMachine();

        cashMachine.add(500);
        cashMachine.add(2000);
        cashMachine.add(200);
        cashMachine.add(-200);
        cashMachine.add(-50);

        assertEquals(3, cashMachine.getNumberOfDeposits());
    }

    @Test
    public void shouldGetSumOfPayouts() {
        CashMachine cashMachine = new CashMachine();

        cashMachine.add(750);
        cashMachine.add(100);
        cashMachine.add(-1200);
        cashMachine.add(-100);

        assertEquals(1300, cashMachine.getSumOfPayouts());
    }

    @Test
    public void shouldGetSumOfDeposits() {
        CashMachine cashMachine = new CashMachine();

        cashMachine.add(750);
        cashMachine.add(1000);
        cashMachine.add(-3000);
        cashMachine.add(-100);

        assertEquals(1750, cashMachine.getSumOfDeposits());
    }
}
