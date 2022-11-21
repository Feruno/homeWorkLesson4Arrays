package org.example;

import java.util.Arrays;

public class WorkingWeek {
    public static void main(String[] args) {
        //Рабочая неделя
        System.out.println("Рабочая неделя");
        int[] workingWeekArray = {1, 1, 1, 2, 3, 5, 0, 2, 2, 2, 1 ,5, 5, 0  , 2, 2, 2, 1 };
        int numberSubarrays = workingWeekArray.length/7;
        int numberSubarraysNotFull = workingWeekArray.length%7;
        int increaseSeven = 0;

        int[] resultArray = new int[numberSubarrays];

        for (int i = 0; i < numberSubarrays; i++) {
            int sum = 0;
            int[] a = Arrays.copyOfRange(workingWeekArray, 0+increaseSeven,7+increaseSeven);//if else + оставшиеся элементы массива
            for (int j = 0; j < a.length; j++) {
                sum = sum + a[j];
            }
            increaseSeven = increaseSeven + 7;
            resultArray[i] = sum;
            //System.out.println(Arrays.toString(a));
            //System.out.println(Arrays.toString(resultArray));
        }
        System.out.println(Arrays.toString(resultArray));
    }
}
