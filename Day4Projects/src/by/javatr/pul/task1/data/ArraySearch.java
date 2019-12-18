package by.javatr.pul.task1.data;

import by.javatr.pul.task1.scanner.ScannerTask1;

public class ArraySearch {
    public static void Arr(){
        int a = ScannerTask1.DataScan();
        int arr[]= new int [a];

    }public static int Search(int arr[], int elementToSearch){
        int firstIndex =0;
        int lastIndex = arr.length-1;
        while (firstIndex<=lastIndex){
            int midIndex = (lastIndex+firstIndex)/2;
            if (arr[midIndex]==elementToSearch){
                return midIndex;
            }else {
                if (arr[midIndex]<elementToSearch){
                    firstIndex=midIndex+1;

                }else {
                    if (arr[midIndex]>elementToSearch){
                        lastIndex = midIndex-1;
                    }
                }
            }
        }
    return -1;}
    public static int SearchMaxMin(){
        int a = ScannerTask1.DataScan();
        int arr[] = new int[a];
        int max = arr[0];
        int min = arr[0];
        for (int i =0; i<arr.length; i++){
            if (max<arr[i]){
                max = arr[i];
            if (min>arr[i]){
            min = arr[i];}
            }

        }

    return SearchMaxMin();}
}
