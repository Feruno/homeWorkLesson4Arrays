package org.example;

import java.util.concurrent.ThreadLocalRandom;

public class CalculateSumElementsArray {
    public static void main(String[] args) {
        //Посчитать сумму элементов в массиве
        System.out.println("Посчитать сумму элементов в массиве");
        int numberArrSum = ThreadLocalRandom.current().nextInt(1, 99);
        int[] arrayRandomSum = new int[numberArrSum];
        int sum = 0;
        for (int i = 0; i < arrayRandomSum.length; i++) {
            int ArrSum = ThreadLocalRandom.current().nextInt(1, 99);
            arrayRandomSum[i] = ArrSum;
            sum = sum + ArrSum;
            System.out.println(arrayRandomSum[i]);
        }
        System.out.println("Сумма элементов массива: " + sum);
    }
}
