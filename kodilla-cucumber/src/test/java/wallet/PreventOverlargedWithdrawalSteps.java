package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class PreventOverlargedWithdrawalSteps implements En {

    private String alert;
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();
    private final Cashier cashier = new Cashier(cashSlot);

    public PreventOverlargedWithdrawalSteps(){

        Given("I have deposited $100 in my wallet", () -> {
            wallet.deposit(100);
            Assert.assertEquals("Incorrect wallet balance", 100, wallet.getBalance());
        });
        When("I withdraw $200", () -> {
            this.alert = cashier.withdraw(wallet, 200);
        });
        Then("Nothing should be dispensed", ()-> {
            Assert.assertEquals(0, cashSlot.getContents());
        });

        Then("I should be told that I don't have enough money in my wallet", ()-> {
            Assert.assertEquals("You don't have enough money",  this.alert);
        });

    }
}
