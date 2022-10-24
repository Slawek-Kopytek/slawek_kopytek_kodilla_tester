package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldWorkWhenBankHasNoCashMachine() {

        Bank bank = new Bank();

        assertEquals(0, bank.getTotalBalance());
        assertEquals(0, bank.getTotalNumberOfDeposits());
        assertEquals(0, bank.getTotalNumberOfPayouts());
        assertEquals(0, bank.getTotalAverageOfDeposits());
        assertEquals(0, bank.getTotalAverageOfPayouts());
    }

    @Test
    public void shouldWorkWhenBankHasOneEmptyCashMachine() {

        CashMachine a1 = new CashMachine();
        CashMachine a2 = new CashMachine();
        CashMachine a3 = new CashMachine();

        a1.add(300);
        a1.add(-400);
        a2.add(1500);
        a2.add(-200);

        Bank bank = new Bank();

        assertEquals(200, bank.getTotalBalance());
        assertEquals(2, bank.getTotalNumberOfDeposits());
        assertEquals(2, bank.getTotalNumberOfPayouts());
        assertEquals(800, bank.getTotalAverageOfDeposits());
        assertEquals(300, bank.getTotalAverageOfPayouts());
    }

    @Test
    public void shouldWorkWhenBankHasOneCashMachineWithOneDeal() {

        CashMachine a1 = new CashMachine();

        a1.add(3000);

        Bank bank = new Bank();

        assertEquals(3000, bank.getTotalBalance());
        assertEquals(1, bank.getTotalNumberOfDeposits());
        assertEquals(0, bank.getTotalNumberOfPayouts());
        assertEquals(3000, bank.getTotalAverageOfDeposits());
        assertEquals(0, bank.getTotalAverageOfPayouts());
    }

    @Test
    public void shouldWorkWhenBankHasNoDeals() {

        CashMachine a1 = new CashMachine();
        CashMachine a2 = new CashMachine();
        CashMachine a3 = new CashMachine();

        Bank bank = new Bank();

        assertEquals(0, bank.getTotalBalance());
        assertEquals(0, bank.getTotalNumberOfDeposits());
        assertEquals(0, bank.getTotalNumberOfPayouts());
        assertEquals(0, bank.getTotalAverageOfDeposits());
        assertEquals(0, bank.getTotalAverageOfPayouts());
    }
}
