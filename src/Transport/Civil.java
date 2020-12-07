package Transport;

public class Civil extends Air {

        int numberOfPassengers;
        boolean bcavailability;

        public double calculatePower(){
            return super.calculatePower(power);
        }

    public String details(){
        return super.details() + String.format(", Number of passengers: %s, Business class availability: %s", numberOfPassengers, bcavailability);
    }
}
