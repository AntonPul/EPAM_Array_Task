package by.javatr.pul.task1.data;

import by.javatr.pul.task1.scanner.ScannerTask1;

public class ArraySort {
    public static int Arr() {
        int a = ScannerTask1.DataScan();//сортировка выбором
        int[] arr = new int[a];
        for (int i = 1; i < a; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i + 1; j < a; j++) {
                if (arr[j] < min) {
                    min = arr[i];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
    return Arr();}

    public static int Arr2() {
        int b = ScannerTask1.DataScan();//сортировка методом "пузырька"
        int[] arr2 = new int[b];
        for (int i = arr2.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr2[j] > arr2[j + 1]) {
                    int bub = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = bub;
                }
            }
        }
    return Arr2();}
}
