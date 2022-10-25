package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        int[] deals = cashMachine.getDeals();
        assertEquals(0, deals.length);
    }
    @Test
    public void shouldAddThreeElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(950);
        cashMachine.add(-50);

        int[] deals = cashMachine.getDeals();
        assertEquals(2, deals.length);
        assertEquals(950, deals[0]);
        assertEquals(-50, deals[1]);
    }
    @Test
    public void shouldCalculateBalance() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(400);
        cashMachine.add(2000);
        cashMachine.add(-1200);

        assertEquals(1200, cashMachine.getBalance(), 0.01);
    }
    @Test
    public void shouldCalculateAveragePayouts() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-100);
        cashMachine.add(4000);
        cashMachine.add(-800);

        assertEquals(-450, cashMachine.getAveragePayouts(), 0.01);
    }
    @Test
    public void shouldCalculateAverageDeposit() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(1200);
        cashMachine.add(-600);
        cashMachine.add(200);

        assertEquals(700, cashMachine.getAverageDeposits(), 0.01);
    }
    @Test
    public void shouldCalculateSumNumberOfDeposit() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(300);
        cashMachine.add(-4100);
        cashMachine.add(-150);
        cashMachine.add(700);

        assertEquals(2, cashMachine.getNumberDeposits(), 0.01);
    }
    @Test
    public void shouldCalculateSumNumberOfPayouts() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-100000400);
        cashMachine.add(450);
        cashMachine.add(-1);
        cashMachine.add(20);

        assertEquals(2, cashMachine.getNumberPayouts(), 0.01);
    }
}
