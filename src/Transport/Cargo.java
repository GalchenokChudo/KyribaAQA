package Transport;

public class Cargo extends Terrestrial {

    int load;

    Cargo(int carryingCapacity, String brand, double fuelConsumption, int max_speed, int numberOfWheels, int power, int weight){
        this.brand = brand;
        capacity = carryingCapacity;
        this.fuelConsumption = fuelConsumption;
        this.max_speed = max_speed;
        this.numberOfWheels = numberOfWheels;
        this.power = power;
        this.weight = weight;
    }

    public String details(){

        return super.details() + String.format(", Carrying capacity: %s", capacity);
    }
}
