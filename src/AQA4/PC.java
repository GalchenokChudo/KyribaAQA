package AQA4;

import java.util.Random;

public class PC {

    String processor;
    String ram;
    String hd;
    int limitOn, limitOff, limit;

    PC(String processor, String ram, String hd, int limit) {
        this.processor = processor;
        this.ram = ram;
        this.hd = hd;
        this.limit = limit;
    }

    void displayInfo() {
        System.out.println("Processor: " + processor);
        System.out.println("Ram: " + ram);
        System.out.println("HD: " + hd);
    }

    void switchOn(int number) {
        Random rnd = new Random();
        int r = rnd.nextInt(2);
        if (r == number) {
            System.out.println("SwitchOn");
            limitOn++;
        } else System.out.println("You tried to switch on PC, but it crashed");
    }

    void switchOff(int number) {
        Random rnd = new Random();
        int r = rnd.nextInt(2);
        if (r == number) {
            System.out.println("SwitchOff");
            limitOff++;
        } else System.out.println("You tried to switch off PC, but it crashed");
    }

    void calculate() {
        if (limit <= limitOff + limitOn) {
            System.out.println("Sorry, but your PC crashed");
        }
    }
}
