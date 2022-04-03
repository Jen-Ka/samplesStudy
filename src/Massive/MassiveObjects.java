package Massive;

import java.util.Arrays;

public class MassiveObjects {

    public static void main(String[] args) {
        int array2 [] = {1,2,3,4,5}; // массив примитивных типов

        Moloko[] korzinaProductov = {new Moloko("Burenka"), new Moloko("Gotina")}; // массив объектов

        printArrayElements(korzinaProductov);

        System.out.println("_________________");

        korzinaProductov[1] = new Moloko("Заменённое молоко 2-го элемента индекса"); // заменяем один из элементов в первом выражении

        printArrayElements(korzinaProductov);

        System.out.println("_________________");

        System.out.println("Длина массива 2: " + korzinaProductov.length); // вычисляем длину массива и распечатываем
        System.out.println("Длина массива 1: " + array2.length);

        System.out.println(Arrays.toString(array2)); //метод Arrays.toString(), выдаёт печатную версию одномерного массива
        System.out.println(Arrays.toString(korzinaProductov));


    }

    private static void printArrayElements(Moloko[] korzinaProductov) {
        for (Moloko milk : korzinaProductov) { // проходим по массиву циклом for each

            System.out.println(milk.toString());
        }
    }
}
