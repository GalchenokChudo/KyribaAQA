package Transport;

public class Passenger extends Terrestrial {

    String bodyType;
    int numberOfPassengers, time;
    double km, fuel;

    Passenger(String bodyType, String brand, double fuelConsumption, int max_speed, int numberOfPassengers, int numberOfWheels, int power, int weight, int time){

        this.bodyType = bodyType;
        this.brand = brand;
        this.fuelConsumption = fuelConsumption;
        this.max_speed = max_speed;
        this.numberOfPassengers = numberOfPassengers;
        this.numberOfWheels = numberOfWheels;
        this.power = power;
        this.weight = weight;
        this.time = time;
        calculateFuel(fuelConsumption, calculatekm(time));

    }

    public double calculatePower(){

        return super.calculatePower(power);
    }

    public double calculatekm(double time){
        km = (time*max_speed)/60;
        return km;
    }

    private double calculateFuel(double fuelConsumption, double km){
        fuel = (fuelConsumption*km)/100;
        return fuel;
    }

    public String details(){
        return super.details() + String.format(", Number of passengers: %s, Body type: %s", numberOfPassengers, bodyType);
    }

    public String calculatedetails(){
           return String.format("За время %s ч., автомобиль %s двигаясь с максимальной скоростью %s км/ч проедет %s км и израсходует %s литров топлива.", time, brand, max_speed, (double) Math.round(km * 100) / 100, (double) Math.round(fuel * 100) / 100);
    }
}
