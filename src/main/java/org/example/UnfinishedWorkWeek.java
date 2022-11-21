package org.example;

import java.util.Arrays;

public class UnfinishedWorkWeek {
    public static void main(String[] args) {
        //Незаконченная рабочая неделя
        System.out.println("Незаконченная рабочая неделя");
        int[] workingWeekArrayUnfinished = {1, 1, 1, 2, 3, 5, 0, 2, 2, 2, 1 ,5, 5, 0  , 2, 2, 2, 1 };
        int numberSubarraysUnfinished = workingWeekArrayUnfinished.length/7;
        int numberSubarraysNotFullUnfinished = workingWeekArrayUnfinished.length%7;
        int increaseSevenUnfinished = 0;
        int  extraСycleUnfinished = 0;

        if (numberSubarraysNotFullUnfinished !=0){
            extraСycleUnfinished = 1;
        }
        int[] resultUnfinishedArray = new int[numberSubarraysUnfinished + extraСycleUnfinished];

        for (int i = 0; i < numberSubarraysUnfinished + extraСycleUnfinished;  i++) {
            int sum = 0;
            int[] a = Arrays.copyOfRange(workingWeekArrayUnfinished, 0+increaseSevenUnfinished,7+increaseSevenUnfinished);
            for (int j = 0; j < a.length; j++) {
                sum = sum + a[j];
            }
            increaseSevenUnfinished = increaseSevenUnfinished + 7;
            resultUnfinishedArray[i] = sum;
            //System.out.println("ds"+Arrays.toString(resultUnfinishedArray));
            //System.out.println(Arrays.toString(a));
            //System.out.println(sum);
        }
        System.out.println(Arrays.toString(resultUnfinishedArray));
    }
}
