package ru.bikert.learning.lesson1;

import ru.bikert.learning.CollectionHelper;
import java.util.List;

public class LinearSearch {

    final int SIZE_COLLECTION = 100;
    final int SOUGHT_NUMBER = 25;

    int soughtNumber = 25;
    List<Integer> sortedList;

    public LinearSearch() {
        System.out.println("LinearSearch is Start DEFAULT!!!");
        sortedList = CollectionHelper.getIntegerSortedList(SIZE_COLLECTION);
        soughtNumber = SOUGHT_NUMBER;
        run();
        System.out.println("LinearSearch is finish!!!");
    }

    public LinearSearch(int number, int size) {
        System.out.println("LinearSearch is Start!!!");
        soughtNumber = number;
        sortedList = CollectionHelper.getIntegerSortedList(size);
        System.out.println("soughtNumber = " + soughtNumber);
        run();
        System.out.println("LinearSearch is finish!!!");
    }

    public LinearSearch(int soughtNumber, List<Integer> sortedList) {
        this.soughtNumber = soughtNumber;
        this.sortedList = sortedList;
        run();
    }

    private void run() {
        System.out.println("LIST: " + sortedList);
        for (int i: sortedList) {
            if (i == soughtNumber) {
                System.out.println("!!!!!!");
                return;
            }
        }
        System.out.println("No element");

    }
}
