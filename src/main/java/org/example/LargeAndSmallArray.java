package org.example;

public class LargeAndSmallArray {
    public static void main(String[] args) {
        //Большой и маленький массив
        System.out.println("Большой и маленький массив");
        int[] LargeAndSmallArray = { 1, 0, 0, 0, 0, 0, 0, 0, 0, 9 };
        int sumLargeAndSmallArray = 0;
        for (int i = 0; i < LargeAndSmallArray.length; i++) {
            sumLargeAndSmallArray = sumLargeAndSmallArray + LargeAndSmallArray[i];
        }
        if( sumLargeAndSmallArray > 100){
            System.out.println("это большой массив");
        } else if (sumLargeAndSmallArray < 100) {
            System.out.println("это маленький массив");
        }
    }
}
