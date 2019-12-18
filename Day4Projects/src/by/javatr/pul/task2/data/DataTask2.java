package by.javatr.pul.task2.data;


import by.javatr.pul.task2.scanner.ScannerTask2;

public class DataTask2 {
    public static int Arr() {
        int a = ScannerTask2.Scan();
        int arr[] = new int[a];
        int sum = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int bub = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = bub;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ScannerTask2.Scan();
        }
        for (int num : arr) {
            sum = sum + num;
            return arr[a];
        }

        public static int Arr1 () {
            int b = ScannerTask2.Scan();
            int arr1[] = new int[b];
            int sum1 = 0;
            for (int i = arr1.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (arr1[j] > arr1[j + 1]) {
                        int bub = arr[j];
                        arr1[j] = arr1[j + 1];
                        arr1[j + 1] = bub;
                    }for (int i = 0; i < arr1.length; i++) {
                        arr1[i] = ScannerTask2.Scan();
                    }
                    for (int num : arr1) {
                        sum1 = sum1 + num; }

                }

                }
                return arr[b];
            }

    }
}