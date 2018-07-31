public class Flyer {

    String passengerName;
    String passengerType = "Normal";
    Integer distanceTravelled = 0;
    int discountOffered = 0;

    public Flyer(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassengerName() {
        return this.passengerName;
    }

    public String getPassengerType() {
        if (distanceTravelled <= 10000) {
            return passengerType;
        }

        if (distanceTravelled > 10000) {
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
    }

    private void setPassengerType(String passengerType) {
        this.passengerType = passengerType;
    }


    public int getDiscountOffered() {

        if (passengerType.equalsIgnoreCase("Frequent Flyer")) {
            discountOffered = 10;
            return discountOffered;
        }
        return discountOffered;
    }
}
