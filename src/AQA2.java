public class AQA2 {
    public static void main(String[] args) {

        /*
        1)Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
суммарный путь пробежит спортсмен за 7 дней?
         */

        double k = 10;
        double sum = 10;
        for (int i = 1; i < 7; i++) {
            k = k * 1.1;
            sum = sum + k;
        }
        System.out.println("7 days: " + sum + " km");

        /*
        2)Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
        */

        int amb = 1;
        for (int i = 3; i <= 24; i+=3) {
            System.out.print(i+" hours, ");
            amb=amb*2;
            System.out.println("amoeba= " + amb);
        }

        /*
        3)Вычислить: 1+2+4+8+...+256
         */
        int binarysum = 0;
        for(int i = 1; i <= 256; i*=2) {
            binarysum +=i;
        }
        System.out.println("1+2+4+8+...+256: " + binarysum);

        /*
        4)Составьте программу, вычисляющую A*B, не пользуясь операцией
умножения.
         */

        int a=5, b=4, c=0;
        for (int i = 0; i < b; i++) {
           c+=a;
        }
        System.out.println("A*B= "+c);

        /*
        5)Напишите программу печати таблицы перевода расстояний из дюймов в
сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
         */
        System.out.println("____________________");
        System.out.println("||INCH||CENTIMETER||");
        double cm=1;
        for (int i = 1; i <= 20; i++) {
            cm=i*2.54;
            System.out.println("____________________");
            System.out.print("|"+i+"   |");
            System.out.println(cm+"      |");
        }
        System.out.println("____________________");

                /*
        6)Напишите программу вывода всех четных чисел от 2 до 100
включительно
         */
        for (int i = 2; i <= 100; i+=2) {
            System.out.println(i+" number");
        }

        /*
        7)Напишите программу, определяющую сумму всех нечетных чисел от 1
до 99
         */
        for (int i = 1; i <= 99; i+=2) {
            System.out.println(i+" number");
        }

        /*
        8) И ещё можете попрактиковаться и нарисовать оставшиеся 2
треугольника
         */
        for (int i = 0; i < 4; i++) {
            for (int j = i+1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}





