package AQA4;

public class AQA4 {

    public static void main(String[] args) {
        PC pc = new PC("Intel", "1024", "HDD", 4);
        pc.displayInfo();

        for (int i = 0; i < pc.limit; i++) {
            pc.switchOn(1);
            pc.switchOff(0);
        }

        pc.calculate();
    }
}
