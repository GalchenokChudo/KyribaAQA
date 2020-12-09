package Transport;

public class Military extends Air {

        boolean ejectionSystem;
        int numberOfRocket;

        Military(){

        }

        public String shot(){
                if (numberOfRocket > 0){
                      message = "The rocket is going ...";
                } else message = "No ammunition";
                return message;
        }

        public String catapult(){
                if (ejectionSystem){
                        message = "The bailout was successful";
                } else message = "You don't have such a system";
                return message;
        }

        public String details(){
                return super.details() + String.format(", Ejection system: %s, Number of rockets: %s", ejectionSystem, numberOfRocket);
        }
}
