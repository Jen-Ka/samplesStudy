package cycle;

import java.util.Random;

public class HomeWork9Lection {
    public static void main(String[] args) {

        generiteHundred();                          // дз в 9 лекции - вывести числа от 1 до 100

        Random r = new Random();                       // дз в 9 лекции - сгенерить 25 случ.чисел, и сравнить каждое между собой
        int x1 = r.nextInt(25)+1;
        int x2 = r.nextInt(25)+1;
        if (x1 > x2) {
            System.out.println(x1 + " > " + x2);
        }
        else if (x1 < x2) {
            System.out.println(x1 + " < " + x2);
        }
        else {
            System.out.println(x1 + " = " + x2);
        }

    }
    private static void generiteHundred() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
