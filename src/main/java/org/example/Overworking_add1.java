package org.example;

public class Overworking_add1 {
    public static void main(String[] args) {
        //Переработки
        System.out.println("Переработки");
        int resultOverworking =0;
        int res = 0;
        int[] overworking = {8, 10, 9, 10, 8, 12, 14, 9 };
        int countSaturdaySunday = 0;

        for (int i = 0; i < overworking.length; i++) {
            int overworkingEachDay = 0;

            resultOverworking = resultOverworking + overworking[i];

            switch (countSaturdaySunday ) {
                case 0,1,2,3,4:
                    res = res + (overworking[i] % 8);
                    overworkingEachDay = overworkingEachDay +(overworking[i] % 8);
                    System.out.println("переработки за каждый день (с пн. по пт) "+ overworkingEachDay + " в часах");
                    break;
                case 5:
                    res = res + overworking[i];
                    overworkingEachDay = overworkingEachDay +(overworking[i]);
                    System.out.println("переработки за каждый день (с сб по вс) "+ overworkingEachDay + " в часах");
                    break;
                case 6:
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
