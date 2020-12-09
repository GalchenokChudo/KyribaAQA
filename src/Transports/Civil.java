package Transports;

public class Civil extends Air {

    boolean bcavailability;

    Civil(int numberOfPassengers){
        capacity = numberOfPassengers;
    }


    public String details() {
        return super.details() + String.format(", Number of passengers: %s, Business class availability: %s", capacity, bcavailability);
    }
}
