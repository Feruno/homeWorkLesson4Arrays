package org.example;

public class PrintValuesArrayWithTheirNumbers {
    public static void main(String[] args) {
        //Распечатать значения элементов массива с их номерами
        //есть другой вариант
        System.out.println("Распечатать значения элементов массива с их номерами");
        int[] arrayWithNumbers = { 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, };
        //Arrays.sort(arrayWithNumbers);
        for (int i = 0; i < arrayWithNumbers.length ; i++) {

            System.out.println( i + " - " + arrayWithNumbers[i]);
        }
    }
}
