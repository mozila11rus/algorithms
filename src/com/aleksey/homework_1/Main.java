package com.aleksey.homework_1;


public class Main {

    // Сложность O(n), так как мы выполняем итерацию n раз.
    private static int inDegree (int number, int degree ) {
        int result = number;
        for (int i = 0; i < degree; i++) {
            result = result * degree;
        } return result;
    }

    // Сложность O(n), так как мы выполняем итерацию n раз.
    private static int minElement (int [] arr) {
        int min = arr [0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr [i] < min) {
                min = arr [i];
            }
        } return min;
    }

    // Сложность O(n). Мы выполняем итерацию n раз, а затем k действий. Так как следующее действие после n одно, то им можно пренебречь.
    private static int mean (int [] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
           sum = sum + arr[i];
        }
        int arMean = sum / arr.length;
        return arMean;
    }
}

