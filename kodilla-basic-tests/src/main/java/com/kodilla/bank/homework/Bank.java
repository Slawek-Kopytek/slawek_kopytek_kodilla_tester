package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] cashMachines;
    private int size;

    public Bank() {
        this.size = 0;
        this.cashMachines = new CashMachine[0];
    }

    public int add(CashMachine cashMachine) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.size -1 ] = cashMachine;
        this.cashMachines = newTab;
        return this.size-1;
    }

    public int getNumberOfCashMachines() {
        return size;
    }
    public double sumBalance() {
        if (size ==0){
            return 0;
        }
        double sum = 0;
        for(int i = 0; i < size; i++){
            sum+=cashMachines[i].getBalance();
        }
        return sum;
    }
    public double sumAverageDeposits(){
        if (size ==0){
            return 0;
        }
        double sum = 0;
        for(int i = 0; i < size; i++){
            sum+=cashMachines[i].getAverageDeposits();
        }
        return sum/getNumberOfCashMachines();
    }
    public double sumAveragePayouts(){
        if (size ==0){
            return 0;
        }
        double sum = 0;
        for(int i = 0; i < size; i++){
            sum+=cashMachines[i].getAveragePayouts();
        }
        return sum/getNumberOfCashMachines();
    }
    public int sumNumberDeposits(){
        if (size ==0){
            return 0;
        }
        int sum = 0;
        for(int i = 0; i < size; i++){
            sum+=cashMachines[i].getNumberDeposits();
        }
        return sum;
    }
    public int sumNumberPayouts(){
        if (size ==0){
            return 0;
        }
        int sum = 0;
        for(int i = 0; i < size; i++){
            sum+=cashMachines[i].getNumberPayouts();
        }
        return sum;
    }
}
