package org.example;

public class AscendingSortedAndUnsortedArray {
    public static void main(String[] args) {
        //Отсортированный по возрастанию и неотсортированный массив
        System.out.println("Отсортированный по возрастанию и неотсортированный массив");
        int[] sortedAndUnsortedArray = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 9 };
        boolean sorted = true;
        for (int i = 0; i < sortedAndUnsortedArray.length - 1; i++) {
            if (sortedAndUnsortedArray[i] > sortedAndUnsortedArray[i+1]) {
                sorted = false;
                break;
            }
        }
        System.out.println(sorted);
        if (sorted){
            System.out.println("массив отсортирован по возрастанию");
        }else {
            System.out.println("массив не отсортирован по возрастанию");
        }
    }
}
