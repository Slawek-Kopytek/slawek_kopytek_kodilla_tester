package homework;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsItFizzOrBuzzSteps implements En {
    private int number;
    private String answer;

    public IsItFizzOrBuzzSteps(){

        Given("the number is {int}", (Integer int1) -> {
            this.number = int1;
        });

        /*Given("the number is {int}", () -> {
            this.number = 3;
        });

        Given("the number is {int}", () -> {
            this.number = 5;
        });

        Given("the number is {int}", () -> {
            this.number = 15;
        });

        Given("the number is {int}", () -> {
            this.number = 18;
        });

        Given("the number is {int}", () -> {
            this.number = 20;
        });

        Given("the number is {int}", () -> {
            this.number = 22;
        });

        Given("the number is {int}", () -> {
            this.number = 60;
        });*/

        When("I check if number is divisible", () -> {
            FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();
            this.answer = fizzBuzzChecker.checkNumberIfDivided(this.number);
        });

        Then("Answer is {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }

}
