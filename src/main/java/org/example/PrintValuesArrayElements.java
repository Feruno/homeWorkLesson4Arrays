package org.example;

import java.util.Arrays;

public class PrintValuesArrayElements {
    public static void main(String[] args) {
        //Распечатать значения всех элементов массива
        System.out.println("Распечатать значения всех элементов массива");
        int[] array = {7, 8, 9, 10, 1, 2, 3, 4, 5, 6 };
        Arrays.sort(array);
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}
