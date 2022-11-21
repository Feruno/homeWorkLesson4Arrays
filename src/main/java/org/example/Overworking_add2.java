package org.example;

import java.util.HashMap;

public class Overworking_add2 {
    public static void main(String[] args) {
        //Переработки
        System.out.println("Переработки");
        int resultOverworking =0;
        int res = 0;

        int[] overworking = {8, 10, 9, 10, 8, 12, 14, 9 };

        int countSaturdaySunday = 1; // перменная с помощью которой определяется будний день или выходной

        HashMap<String, Integer> startingDay = new HashMap<>();
        startingDay.put("Четверг", 4);

        int weekday = startingDay.get("Четверг");
        switch (weekday) {
            case 1: countSaturdaySunday = 1;
                break;
            case 2: countSaturdaySunday = 2;
                break;
            case 3:  countSaturdaySunday = 3;
                break;
            case 4:  countSaturdaySunday = 4;
                break;
            case 5:  countSaturdaySunday = 5;
                break;
            case 6:  countSaturdaySunday = 6;
                break;
            case 7:  countSaturdaySunday = 7;
                break;
        }

        for (int i = startingDay.get("Четверг")-1; i < overworking.length; i++) {
            int overworkingEachDay = 0; //переработки за каждый день
            resultOverworking = resultOverworking + overworking[i];
            switch (countSaturdaySunday) {
                case 1,2,3,4,5:
                    res = res + (overworking[i] % 8);
                    overworkingEachDay = overworkingEachDay +(overworking[i] % 8);
                    System.out.println("переработки за каждый день (с пн. по пт) "+ overworkingEachDay + " в часах");
                    break;
                case 6:
                    res = res + overworking[i];
                    overworkingEachDay = overworkingEachDay +(overworking[i]);
                    System.out.println("переработки за каждый день (с сб по вс) "+ overworkingEachDay + " в часах");
                    break;
                case 7:
                    res = res + overworking[i];
                    overworkingEachDay = overworkingEachDay +(overworking[i]);
                    System.out.println("переработки за каждый день  (с сб по вс) "+ overworkingEachDay + " в часах");
                    countSaturdaySunday =0;
                    break;
            }
            countSaturdaySunday++;
        }
        System.out.println("Часов переработки Пети "+res + " (Основная задача)");
    }
}
