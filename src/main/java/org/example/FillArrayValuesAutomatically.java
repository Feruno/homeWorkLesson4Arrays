package org.example;

public class FillArrayValuesAutomatically {
    public static void main(String[] args) {
        //Заполнить массив значениями автоматически
        System.out.println("Заполнить массив значениями автоматически");
        int[] arrayValuesAutomatically = new int[100];
        for (int i = 0; i < 100; i++) {
            arrayValuesAutomatically[i] = i;
            //System.out.println( arrayValuesAutomatically[i]);
        }
    }
}
