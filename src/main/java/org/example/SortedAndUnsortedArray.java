package org.example;

public class SortedAndUnsortedArray {
    public static void main(String[] args) {
        //Отсортированный и неотсортированный массив
        System.out.println("Отсортированный и неотсортированный массив");
        int[] sortedArray = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 9  };
        boolean sorteAndUnsortedIncrement = true;
        boolean sorteAndUnsortedDecrease = true;
        for (int i = 0; i < sortedArray.length - 1; i++) {
            if ( (sortedArray[i] > sortedArray[i+1]) ) {
                sorteAndUnsortedIncrement = false;
            }

            if ( (sortedArray[i] < sortedArray[i+1]) ) {
                sorteAndUnsortedDecrease = false;
            }
        }
        //System.out.println(sorteAndUnsortedIncrement);
        //System.out.println(sorteAndUnsortedDecrease);
        if (sorteAndUnsortedIncrement || sorteAndUnsortedDecrease){
            System.out.println("элементы массива отсортированы");
        }else {
            System.out.println("элементы массива не отсортированы");
        }
    }
}
