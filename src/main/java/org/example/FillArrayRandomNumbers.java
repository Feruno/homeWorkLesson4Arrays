package org.example;

import java.util.concurrent.ThreadLocalRandom;

public class FillArrayRandomNumbers {
    public static void main(String[] args) {
        //Заполнить массив случайными числами
        System.out.println("Заполнить массив случайными числами");
        //Случайное число должно быть больше нуля и меньше 100.
        int number = ThreadLocalRandom.current().nextInt(1, 99);
        int[] arrayRandom = new int[number];
        for (int i = 0; i < arrayRandom.length; i++) {
            int ArrSum = ThreadLocalRandom.current().nextInt(1, 99);
            arrayRandom[i] = ArrSum;
            System.out.println(arrayRandom[i]);
        }
    }
}
