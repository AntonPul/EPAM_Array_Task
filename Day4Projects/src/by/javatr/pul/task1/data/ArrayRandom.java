package by.javatr.pul.task1.data;

import java.util.Random;

public class ArrayRandom {
    public static int RandomTask1() {
        Random random = new Random();
        int r = random.nextInt();
        int arr[] = new int[r];
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int bub = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = bub;

                }
            }
        }
    return arr[r];}
}