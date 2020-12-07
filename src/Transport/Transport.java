package Transport;

public class Transport {

    public int power;
    public int max_speed;
    public int weight;
    public String brand;
    double killopower;

    public Transport(){

    }

    public double calculatePower(int power){
        killopower = power*0.74;
        return killopower;
    }

    public String details(){
        return String.format("Power: %s, Power in kV: %s, Max speed: %s, Weight: %s, Brand: %s", power, killopower, max_speed, weight, brand);
    }
}
