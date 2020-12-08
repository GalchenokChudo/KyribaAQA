package Transport;

import static java.lang.System.*;

public class Test {

    public static void main(String[] args) {

        Civil plain = new Civil(467);
        Military shark = new Military();
        Passenger toyota = new Passenger("Minivan", "Corolla", 6.2, 170, 7, 4, 4, 8000, 9);
        Cargo maz = new Cargo(100,"B9-1420/1470", 7.1,90, 4,3,52000);

        plain.bcavailability = true;
        plain.brand = "Boeing 747";
        plain.max_speed = 170;
        plain.power = 5;
        plain.weight = 84000;
        plain.minRunway = 100;
        plain.wingspan = 68.5;

        shark.ejectionSystem = true;
        shark.brand = "Black shark";
        shark.max_speed = 230;
        shark.numberOfRocket = 12;
        shark.power = 15;
        shark.weight = 63000;
        shark.minRunway = 40;
        shark.wingspan = 54.5;

        plain.calculatePower();
        shark.calculatePower();
        toyota.calculatePower();
        maz.calculatePower();

        out.println(plain.details());
        out.println(shark.details());
        out.println(toyota.details());
        out.println(maz.details());

        out.println(toyota.calculatedetails());
        out.println(String.format("Plain: %s", plain.checkloading(450)));
        out.println(String.format("Maz: %s",maz.checkloading(90)));
        out.println(String.format("Military plain: %s", shark.shot()));
        out.println(String.format("Military plain: %s", shark.catapult()));
    }
}
