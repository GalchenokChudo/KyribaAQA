package Transport;

public class Military extends Air {

        boolean ejectionSystem;
        int numberOfMissiles;

        public double calculatePower(){
                return super.calculatePower(power);
        }

        public String details(){
                return super.details() + String.format(", Ejection system: %s, Number of missiles: %s", ejectionSystem, numberOfMissiles);
        }
}
