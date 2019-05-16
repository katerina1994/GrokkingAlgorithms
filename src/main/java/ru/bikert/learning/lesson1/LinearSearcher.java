package ru.bikert.learning.lesson1;

import ru.bikert.learning.CollectionHelper;
import java.util.List;

public class LinearSearcher implements Searcher {

    final int SIZE_COLLECTION = 100;
    final int SOUGHT_NUMBER = 25;

    int soughtNumber = 25;
    List<Integer> sortedList;

    public LinearSearcher() {
        System.out.println("LinearSearcher is Start DEFAULT!!!");
        sortedList = CollectionHelper.getIntegerSortedList(SIZE_COLLECTION);
        soughtNumber = SOUGHT_NUMBER;
        run();
        System.out.println("LinearSearcher is finish!!!");
    }

    public LinearSearcher(int number, int size) {
        System.out.println("LinearSearcher is Start!!!");
        soughtNumber = number;
        sortedList = CollectionHelper.getIntegerSortedList(size);
        System.out.println("soughtNumber = " + soughtNumber);
        run();
        System.out.println("LinearSearcher is finish!!!");
    }

    public LinearSearcher(int soughtNumber, List<Integer> sortedList) {
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

    @Override
    public <T extends Comparable<T>> int SearchIndex(List<T> sortedList, T target) {
        return 0;
    }
}
