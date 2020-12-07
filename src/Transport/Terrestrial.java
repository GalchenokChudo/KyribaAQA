package Transport;

public class Terrestrial extends Transport {

    public int numberOfWheels;
    public double fuelConsumption;

    public String details(){
        return super.details() + String.format(", Number of wheels: %s, Fuel consumption: %s", numberOfWheels, fuelConsumption);
    }
}
