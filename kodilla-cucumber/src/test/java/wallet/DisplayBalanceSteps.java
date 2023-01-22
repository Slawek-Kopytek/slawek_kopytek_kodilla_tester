package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class DisplayBalanceSteps implements En {

    private int balance;

    private final Wallet wallet = new Wallet();


    public DisplayBalanceSteps() {

        //<-----------------------DisplayBalance--------------------->

        Given("there is $0 in my wallet", () -> {
            wallet.deposit(0);
            Assert.assertEquals("Incorrect wallet balance",0, wallet.getBalance());
        });

        Given("there is $100 in my wallet", () -> {
            wallet.deposit(100);
            Assert.assertEquals("Incorrect wallet balance",100, wallet.getBalance());
        });

        Given("there is $99999 in my wallet", () -> {
            wallet.deposit(99999);
            Assert.assertEquals("Incorrect wallet balance",99999, wallet.getBalance());
        });

        When("I check the balance of my wallet", () -> {
            this.balance = wallet.getBalance();
        });

        Then("I should see that the balance is $0", () -> {
            String display = wallet.displayBalance();
            Assert.assertEquals("User balance: $0", display);
        });

        Then("I should see that the balance is $100", () -> {
            String display = wallet.displayBalance();
            Assert.assertEquals("User balance: $100", display);
        });

        Then("I should see that the balance is $99999", () -> {
            String display = wallet.displayBalance();
            Assert.assertEquals("User balance: $99999", display);
        });
    }
}
