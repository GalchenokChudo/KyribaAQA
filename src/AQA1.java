public class AQA1 {

    public static void main(String[] args) {
        System.out.println("Hello Kyriba");
        /* Task1:
        В переменную записываем число. Надо вывести на экран сколько в этом
числе цифр и положительное оно или отрицательное. Например, "это
однозначное положительное число". Достаточно будет определить, является ли
число однозначным, "двухзначным или трехзначным и более.
         */
        int num1 =4000;

        if (num1 < 0) {
            if (num1 > -10) {
                System.out.println("This is single negative number");
            } else if (num1 > -100) {
                System.out.println("This is double negative number");
            } else {
                System.out.println("This is three-digit or more negative number");
            }
        } else if (num1 > 0) {
            if (num1 < 10) {
                System.out.println("This is single positive number");
            } else if (num1 < 100) {
                System.out.println("This is double positive number");
            } else {
                System.out.println("This is three-digit or more positive number");
            }
        } else {
            System.out.println("This is 0");
        }
    }
}
