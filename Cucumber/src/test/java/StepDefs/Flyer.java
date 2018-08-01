package StepDefs;


public class Flyer {

    String passengerName;
    String passengerType = "Normal";
    Integer distanceTravelled;
    int discountOffered ;
    String registrationScheme;

    public Flyer(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassengerName() {
        return this.passengerName;
    }

    public String getPassengerType() {
        if (distanceTravelled < 10000) {
            return passengerType;
        }

        if (distanceTravelled >= 10000) {
            setPassengerType("Frequent Flyer");
            return passengerType;
        }

        return "Customer Type can not be defined";
    }

    public Integer getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setDistanceTravelled(int distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
        if(distanceTravelled>=10000){
            setPassengerType("Frequent Flyer");
        }

    }

    private void setPassengerType(String passengerType) {
        this.passengerType = passengerType;
    }


    public int getDiscountOffered() {
if(registrationScheme!=null) {
    if (passengerType.equalsIgnoreCase("Frequent Flyer") && registrationScheme.equalsIgnoreCase("Diwali")) {
        discountOffered = 15;
        return discountOffered;
    }
}
        if (passengerType.equalsIgnoreCase("Frequent Flyer")){
            discountOffered = 10;
            return discountOffered;
        }
        return discountOffered=0;
    }

    public void setRegistrationScheme(String registrationScheme){
        this.registrationScheme = registrationScheme;
    }
}

