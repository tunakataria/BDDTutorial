package StepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FrequentFlyersSteps {

    @Given("customer is new to airlines")
    public void customer_is_new_to_airlines() {
    }


    @When("Customer completes 10000 km with the airlines")
    public void customer_completes_km_with_the_airlines() {
        // Write code here that turns the phrase above into concrete actions
        
    }

    @Then("^An extra discount of \"([^\"]*)\" percent should be provided to customer for next booking$")
    public void an_extra_discount_of_percent_should_be_provided_to_customer_for_next_booking(String int1) {

        System.out.print(int1);

        
    }
}
