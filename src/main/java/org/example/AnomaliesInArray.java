package org.example;

public class AnomaliesInArray {
    public static void main(String[] args) {
        //Найти в массиве аномалии
        //есть ошибка вывода
        System.out.println("Найти в массиве аномалии");

        int[] anomaliesInArray = {56, 45, 38, 155, 100, 101};

        for (int i = 0; i < anomaliesInArray.length-1; i++) {


            if (anomaliesInArray[i] < anomaliesInArray[i+1]){
                System.out.println(anomaliesInArray[i]);
                System.out.println(anomaliesInArray[i+1] + " <---- аномальный элемент");
            }else {
                System.out.println(anomaliesInArray[i]);
            }

        }
    }
}
