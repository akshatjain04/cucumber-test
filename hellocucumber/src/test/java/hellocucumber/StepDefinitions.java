
package hellocucumber;

import org.junit.jupiter.api.Assertions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StepDefinitions {

    private String today;
    private String actualResponse;

    @Given("today is Sunday")
    public void today_is_sunday() {
        today = "Sunday";
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        if (today.equals("Sunday")) {
            actualResponse = "Nope";
        } else {
            actualResponse = "Yes";
        }
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedResponse) {
        Assertions.assertEquals(expectedResponse, actualResponse);
    }
}

/*
 * package hellocucumber;
 * 
 * import io.cucumber.java.en.Given;
 * import io.cucumber.java.en.When;
 * import io.cucumber.java.en.Then;
 * import static org.junit.jupiter.api.Assertions.*;
 * 
 * class IsItFriday {
 * static String isItFriday(String today) {
 * return "Nope";
 * }
 * }
 * 
 * public class StepDefinitions {
 * private String today;
 * private String actualAnswer;
 * 
 * @Given("today is Sunday")
 * public void today_is_Sunday() {
 * today = "Sunday";
 * }
 * 
 * @When("I ask whether it's Friday yet")
 * public void i_ask_whether_it_s_Friday_yet() {
 * actualAnswer = IsItFriday.isItFriday(today);
 * }
 * 
 * @Then("I should be told {string}")
 * public void i_should_be_told(String expectedAnswer) {
 * assertEquals(expectedAnswer, actualAnswer);
 * }
 * }
 * 
 */