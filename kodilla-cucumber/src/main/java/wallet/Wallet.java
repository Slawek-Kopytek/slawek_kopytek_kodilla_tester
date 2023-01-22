package wallet;

public class Wallet {
    private int balance = 0;

    public Wallet() {
    }
    public void deposit(int money) {
        if(money > 0)
            this.balance += money;
    }


    public int getBalance() {
        return balance;
    }
    public String display(){
        return "User balance: $" + getBalance();
    }

    public String debit(int money){
        String display = "You have enough money";
        if (this.balance >= money) {
            this.balance -= money;
            System.out.println(display);
            return display;
        }
        String result = "You don't have enough money";
        System.out.println(result);
        return result;

    }
}
