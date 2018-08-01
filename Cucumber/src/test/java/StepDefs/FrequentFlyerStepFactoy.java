package StepDefs;

import net.thucydides.core.annotations.Step;

public class FrequentFlyerStepFactoy {

    Flyer newFlyer;

    @Step
    public Flyer createANewFlyer() {
        newFlyer = new Flyer("Hitesh");
        return newFlyer;
    }

    @Step
    public void registerCustomerInAParticularScheme() {
        createANewFlyer();
        newFlyer.setRegistrationScheme("Diwali");
    }

    @Step
    public void makeFlyerTravelDistance(int distance){
        newFlyer.setDistanceTravelled(distance);
    }

    @Step
    public boolean verifyExtraDiscountGivenToACutomer(int dicountToTest){
       int discountOffered = newFlyer.getDiscountOffered();
       return dicountToTest==discountOffered;
    }
}
