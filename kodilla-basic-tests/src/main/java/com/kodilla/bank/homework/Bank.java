package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] cashMachines;
    private int size;

    public Bank() {
        this.size = 0;
        this.cashMachines = new CashMachine[0];
    }

    public int getTotalBalance() {
        int totalBalance = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            CashMachine cashMachine = cashMachines[i];
            totalBalance += cashMachine.getBalance();
        }
        return totalBalance;
    }

    public int getTotalNumberOfPayouts() {
        int totalNumberOfDeals = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalNumberOfDeals += cashMachines[i].getNumberOfPayouts();
        }
        return totalNumberOfDeals;
    }

    public int getTotalNumberOfDeposits() {
        int totalNumberOfDeposits = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalNumberOfDeposits += cashMachines[i].getNumberOfDeposits();
        }
        return totalNumberOfDeposits;
    }

    public double getTotalAverageOfDeposits() {
        int depositsCount = getTotalNumberOfDeposits();
        if (depositsCount == 0) {
            return 0;
        }

        double totalSumOfDeposits = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalSumOfDeposits += cashMachines[i].getSumOfDeposits();
        }
        return totalSumOfDeposits / depositsCount;
    }

    public double getTotalAverageOfPayouts() {
        int dealsCount = getTotalNumberOfPayouts();
        if (dealsCount == 0) {
            return 0;
        }

        double totalSumInMinus = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalSumInMinus += cashMachines[i].getSumOfPayouts();
        }
        return totalSumInMinus / dealsCount;
    }
}
