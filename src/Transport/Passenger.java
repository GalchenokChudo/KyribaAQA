package Transport;

public class Passenger extends Terrestrial {

    String bodyType;
    int numberOfPassengers;
    double km, fuel;

    public double calculatePower(){
        return super.calculatePower(power);
    }

    public double calculatekm(double time){
        km = (time*max_speed)/60;
        return km;
    }

    //как работать с этим классом, если он будет private???
    public double calculateFuel(double fuelConsumption, double km){
        fuel = (fuelConsumption*km)/100;
        return fuel;
    }


    public String details(){
        return super.details() + String.format(", Number of passengers: %s, Body type: %s", numberOfPassengers, bodyType);
    }

    public String calculatedetails(double time){
           return String.format("За время %sч., автомобиль %s двигаясь с максимальной скоростью %s км/ч проедет %sкм и израсходует %s литров топлива.", time, brand, max_speed, km, fuel);
    }
}
