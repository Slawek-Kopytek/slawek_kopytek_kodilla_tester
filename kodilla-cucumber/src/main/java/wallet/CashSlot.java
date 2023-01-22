package wallet;

public class CashSlot {
    private int contents;

    public int getContents(){
        return contents;
    }

    public void dispense(Wallet wallet, int amount){
        if(wallet.getBalance() > amount) {
            this.contents = amount;
        }
    }
}
