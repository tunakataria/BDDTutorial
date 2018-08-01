package StepDefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class FrequentFlyersSteps {
    @Steps
    FrequentFlyerStepFactoy frequentFlyerStepFactoy;


    Flyer newFlyer;
    @Given("customer is new to airlines")
    public void customer_is_new_to_airlines() {
        frequentFlyerStepFactoy.createANewFlyer();
    }

    @Given("Customer is new to airline and has registered under some scheme")
    public void customer_is_new_to_airline_and_has_registered_under_some_scheme() {
        frequentFlyerStepFactoy.registerCustomerInAParticularScheme();
    }


    @When("Customer completes 10000 km with the airlines")
    public void customer_completes_km_with_the_airlines() {
      frequentFlyerStepFactoy.makeFlyerTravelDistance(10000);
    }

    @Then("^An extra discount of \"([^\"]*)\" percent should be provided to customer for next booking$")
    public void an_extra_discount_of_percent_should_be_provided_to_customer_for_next_booking(String disocunt) {
        Assert.assertTrue("Disocunt offered was not correct",frequentFlyerStepFactoy.verifyExtraDiscountGivenToACutomer(Integer.parseInt(disocunt)));
        
    }
}
