package StepDefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class FrequentFlyersSteps {


    Flyer newFlyer;
    @Given("customer is new to airlines")
    public void customer_is_new_to_airlines() {
         newFlyer = new Flyer("Hitesh");
    }


    @When("Customer completes 10000 km with the airlines")
    public void customer_completes_km_with_the_airlines() {
      newFlyer.setDistanceTravelled(10000);
    }

    @Then("^An extra discount of \"([^\"]*)\" percent should be provided to customer for next booking$")
    public void an_extra_discount_of_percent_should_be_provided_to_customer_for_next_booking(String disocunt) {

       int discountToTest= Integer.parseInt(disocunt);

        int discountoffered = newFlyer.getDiscountOffered();

        System.out.print(discountoffered);

        Assert.assertTrue(discountoffered==discountToTest);

        
    }
}
