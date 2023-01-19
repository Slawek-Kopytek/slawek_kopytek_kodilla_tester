package homework;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsItFizzOrBuzzSteps implements En {
    private int number;
    private String answer;

    public IsItFizzOrBuzzSteps(){

        Given("The number is 2", () -> {
            this.number = 2;
        });

        Given("The number is 3", () -> {
            this.number = 3;
        });

        Given("The number is 5", () -> {
            this.number = 5;
        });

        Given("The number is 15", () -> {
            this.number = 15;
        });

        Given("The number is 18", () -> {
            this.number = 18;
        });

        Given("The number is 20", () -> {
            this.number = 20;
        });

        Given("The number is 22", () -> {
            this.number = 22;
        });

        Given("The number is 60", () -> {
            this.number = 60;
        });

        When("I check if number is divisible", () -> {
            FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();
            this.answer = fizzBuzzChecker.checkNumberIfDivided(this.number);
        });

        Then("Answer is {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }

}
