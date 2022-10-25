package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldAddThreeCashMachines() {
        Bank bank = new Bank();
        CashMachine machineOne = new CashMachine();
        CashMachine machineTwo = new CashMachine();
        CashMachine machineThree = new CashMachine();
        bank.add(machineOne);
        bank.add(machineTwo);
        bank.add(machineThree);

        assertEquals(3, bank.getNumberOfCashMachines(),0.01);
    }
    @Test
    public void shouldCalculateSumBalance() {
        Bank bank = new Bank();
        CashMachine machineOne = new CashMachine();
        CashMachine machineTwo = new CashMachine();
        bank.add(machineOne);
        bank.add(machineTwo);

        machineOne.add(500);
        machineOne.add(-300);
        machineTwo.add(1000);
        machineTwo.add(-300);

        assertEquals(900, bank.sumBalance(), 0.01);
    }
    @Test
    public void shouldCalculateSumAverageDeposit() {
        Bank bank = new Bank();
        CashMachine machineOne = new CashMachine();
        CashMachine machineTwo = new CashMachine();
        bank.add(machineOne);
        bank.add(machineTwo);
        machineOne.add(100);
        machineOne.add(300);
        machineTwo.add(100);
        machineTwo.add(-200);

        assertEquals(150, bank.sumAverageDeposits(), 0.01);
    }
    @Test
    public void shouldCalculateSumAveragePayouts() {
        Bank bank = new Bank();
        CashMachine machineOne = new CashMachine();
        CashMachine machineTwo = new CashMachine();
        bank.add(machineOne);
        bank.add(machineTwo);
        machineOne.add(50);
        machineOne.add(-200);
        machineTwo.add(-800);
        machineTwo.add(1600);

        assertEquals(-500, bank.sumAveragePayouts(), 0.01);
    }
    @Test
    public void shouldCalculateSumNumberOfDeposits() {
        Bank bank = new Bank();
        CashMachine machineOne = new CashMachine();
        CashMachine machineTwo = new CashMachine();
        bank.add(machineOne);
        bank.add(machineTwo);
        machineOne.add(800);
        machineOne.add(-200);
        machineTwo.add(500);
        machineTwo.add(-800);

        assertEquals(2, bank.sumNumberDeposits(), 0.01);
    }
    @Test
    public void shouldCalculateSumNumberOfPayouts() {
        Bank bank = new Bank();
        CashMachine machineOne = new CashMachine();
        CashMachine machineTwo = new CashMachine();
        bank.add(machineOne);
        bank.add(machineTwo);
        machineOne.add(-100);
        machineOne.add(-400);
        machineOne.add(200);
        machineTwo.add(-20);
        machineTwo.add(-400);

        assertEquals(4, bank.sumNumberPayouts(), 0.01);
    }
}
