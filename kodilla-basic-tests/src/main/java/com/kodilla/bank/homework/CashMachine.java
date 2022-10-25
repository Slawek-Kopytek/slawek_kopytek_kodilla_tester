package com.kodilla.bank.homework;

public class CashMachine {
    private int[] deals;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.deals = new int[0];
    }

    public void add(int deal) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(deals, 0, newTab, 0, deals.length);
        newTab[this.size - 1] = deal;
        this.deals = newTab;
    }

    public int[] getDeals() {
        return deals;
    }

    public int getBalance() {
        if (this.deals.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < this.deals.length; i++) {
            sum += this.deals[i];
        }
        return sum;
    }

    public int getAveragePayouts() {

        if (this.deals.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < this.deals.length; i++) {
            if (deals[i] < 0) {
                sum += this.deals[i];
            }
        }
        return sum / getNumberPayouts();
    }
    public int getAverageDeposits() {

        if (this.deals.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < this.deals.length; i++) {
            if (deals[i] > 0) {
                sum += this.deals[i];
            }
        }
        return sum / getNumberDeposits();
    }
    public int getNumberDeposits() {
        if (this.size == 0) {
            return 0;
        }
        int number = 0;
        for (int i = 0; i < this.size; i++) {
            if (deals[i] > 0) {
                number++;
            }
        }
        return number;
    }
    public int getNumberPayouts() {
        if (this.size == 0) {
            return 0;
        }
        int number = 0;
        for (int i = 0; i < this.size; i++) {
            if (deals[i] < 0) {
                number++;
            }
        }
        return number;
    }
}
