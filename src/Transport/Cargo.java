package Transport;

public class Cargo extends Terrestrial {

    int carryingCapacity;

    public double calculatePower(){
        return super.calculatePower(power);
    }

    public String details(){
        return super.details() + String.format(", Carrying capacity: %s", carryingCapacity);
    }
}
