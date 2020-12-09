package Transports;

public class Transport {

    public int power, capacity, max_speed, weight;
    public String brand, message;
    double killopower;

    public double calculatePower(){
        killopower = power*0.74;
        return killopower;
    }

    public String checkloading(int load){
        if (capacity <= load){
            message = "Loading is complete";
        } else message = "You need a bigger transport";

        return String.format("%s", message);
    }

    public String details(){
        return String.format("Power: %s, Power in kV: %s, Max speed: %s, Weight: %s, Brand: %s", power, (double) Math.round(killopower * 100) / 100, max_speed, weight, brand);
    }
}
