package org.example;
/*
 Программист Петя работает в аутсорсе и каждый день записывает в джиру, сколько
часов он отработал сегодня.
Но для порядку он также записывает это количество часов в массив, чтобы ничего не
забыть. Часы за каждый день он записывает в новый элемент массива.
То есть, если Петя работал вот так
Понедельник - 8 часов Вторник - 10 часов Среда - 9 часов Четверг - 10 часов Пятница
- 8 часов Суббота - 12 часов Воскресенье - 14 часов Понедельник - 9 часов
То масив будет заполнен вот так:
8 10 9 10 8 12 14 9
Помоги Пете!
Напиши программу, которая посчитает сколько Петя переработал, при условии, что
рабочий день должен состоять из 8 (восьми) часов.
Для массива из примера переработки в сумме будут 32 часа*/

public class Overworking {
    public static void main(String[] args) {
        //Переработки
        System.out.println("Переработки");
        int resultOverworking =0;
        int res = 0;
        int[] overworking = {8, 10, 9, 10, 8, 12, 14, 9 };
        int countSaturdaySunday = 0;

        for (int i = 0; i < overworking.length; i++) {

            resultOverworking = resultOverworking + overworking[i];

            switch (countSaturdaySunday ) {
                case 0,1,2,3,4:
                    res = res + (overworking[i] % 8);
                    break;
                case 5:
                    res = res + overworking[i];
                    //System.out.println("суббота");
                    break;
                case 6:
                    res = res + overworking[i];
                    //System.out.println("воскресенье ");
                    countSaturdaySunday =0;
                    break;
            }
            countSaturdaySunday++;
        }
        System.out.println("Часов переработки Пети "+res + " (Основная задача)");
    }
}
