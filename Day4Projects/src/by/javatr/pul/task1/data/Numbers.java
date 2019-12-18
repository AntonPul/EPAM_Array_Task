package by.javatr.pul.task1.data;

import by.javatr.pul.task1.scanner.ScannerTask1;

public class Numbers {
    public static int FibonachiNumbers(){
        int a = ScannerTask1.DataScan();
        int arr[]  = new int [a];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i<a;++i){
            arr[i] = arr[i-1] + arr[i-2];
        }
    return FibonachiNumbers();}
    public static int SimpleNumbers(){
        int a = ScannerTask1.DataScan();
        int arr[] = new int [a];
        for (int i =2; i<a;i++){
            boolean b = true;
            int simple = (int)Math.sqrt(i);
            for (int j=2; j<=simple;j++){
                if ((i%j)==0){
                    b = false;
                }
            }
        }
    return SimpleNumbers();}
}
