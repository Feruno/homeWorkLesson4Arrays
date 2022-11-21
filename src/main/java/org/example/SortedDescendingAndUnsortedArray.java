package org.example;

public class SortedDescendingAndUnsortedArray {
    public static void main(String[] args) {
        //Отсортированный по убыванию и неотсортированный массив
        System.out.println("Отсортированный по убыванию и неотсортированный массив");
        int[] sortedAndUnsortedDecreaseArray = { 3, 2, 1, 0, 0, 0, 0, 0, 0, 0 };
        boolean sortedDecrease = true;
        for (int i = 0; i < sortedAndUnsortedDecreaseArray.length - 1; i++) {
            if (sortedAndUnsortedDecreaseArray[i] < sortedAndUnsortedDecreaseArray[i+1]) {
                sortedDecrease = false;
                break;
            }
        }
        System.out.println(sortedDecrease);
        if (sortedDecrease){
            System.out.println("массив отсортирован по убыванию");
        }else {
            System.out.println("массив не отсортирован по убыванию");
        }
    }
}
