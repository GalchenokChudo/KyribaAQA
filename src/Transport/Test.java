package Transport;

import static java.lang.System.*;

public class Test {

    public static void main(String[] args) {

        Civil plain = new Civil();
        Military tank = new Military();
        Passenger toyota = new Passenger();
        Cargo maz = new Cargo();

        plain.bcavailability = true;
        plain.brand = "Boeing 747";
        plain.max_speed = 170;
        plain.numberOfPassengers = 467;
        plain.power = 5;
        plain.weight = 84000;
        plain.minRunway = 100;
        plain.wingspan = 68.5;

        tank.ejectionSystem = true;
        tank.brand = "Black shark";
        tank.max_speed = 230;
        tank.numberOfMissiles = 12;
        tank.power = 15;
        tank.weight = 63000;
        tank.minRunway = 40;
        tank.wingspan = 54.5;

        toyota.bodyType = "Minivan";
        toyota.brand = "Corolla";
        toyota.fuelConsumption = 6.2;
        toyota.max_speed = 170;
        toyota.numberOfPassengers =7;
        toyota.numberOfWheels = 4;
        toyota.power = 4;
        toyota.weight = 8000;

        maz.carryingCapacity = 100;
        maz.brand = "B9-1420/1470";
        maz.fuelConsumption = 7.1;
        maz.max_speed = 90;
        maz.numberOfWheels = 4;
        maz.power = 3;
        maz.weight = 52000;

        plain.calculatePower();
        tank.calculatePower();
        toyota.calculatePower();
        maz.calculatePower();

        out.println(plain.details());
        out.println(tank.details());
        out.println(toyota.details());
        out.println(maz.details());

        toyota.calculateFuel(toyota.fuelConsumption,toyota.calculatekm(7));
        out.println(toyota.calculatedetails());
    }
}
