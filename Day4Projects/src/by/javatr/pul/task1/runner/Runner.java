package by.javatr.pul.task1.runner;

import by.javatr.pul.task1.data.ArraySearch;
import by.javatr.pul.task1.data.ArraySort;
import by.javatr.pul.task1.data.Numbers;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Enter array ");
        System.out.println("Fibonachi numbers "+Numbers.FibonachiNumbers());
        System.out.println("Simple numbers " + Numbers.SimpleNumbers());
        System.out.println("First sorting " + ArraySort.Arr());
        System.out.println("Second sorting " + ArraySort.Arr2());
        System.out.println("Searching max and min numbers " + ArraySearch.SearchMaxMin());

    }
}
