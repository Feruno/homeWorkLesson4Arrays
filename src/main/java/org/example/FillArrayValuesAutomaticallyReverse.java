package org.example;

public class FillArrayValuesAutomaticallyReverse {
    public static void main(String[] args) {
        //Заполнить массив значениями автоматически в обратном порядке
        System.out.println("Заполнить массив значениями автоматически в обратном порядке");
        int[] arrayValuesAutomaticallyReverse = new int[100];
        for (int i = 99; i >= 0; i--) {
            arrayValuesAutomaticallyReverse[i] = i;
            //System.out.println( arrayValuesAutomaticallyReverse[i]);
        }
    }
}
