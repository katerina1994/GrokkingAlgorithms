package ru.bikert.learning.lesson1;

import ru.bikert.learning.CollectionHelper;
import java.util.List;
/*
    Бинарный поиск для значений типа интеджер
 */
public class BinarySearch {

    private List<Integer> sortedList;
    private Integer soughtNumber;

    public BinarySearch() {
        sortedList = CollectionHelper.getIntegerSortedList(100);
        soughtNumber = 25;
        run();
    }

    public BinarySearch(List<Integer> sortedList, Integer soughtNumber) {
        this.soughtNumber = soughtNumber;
        this.sortedList = sortedList;
        run();
    }

    public BinarySearch(Integer number, int size) {
        System.out.println("BinarySearch is Start!!!");
        sortedList = CollectionHelper.getIntegerSortedList(size);
        soughtNumber = number;
        System.out.println("soughtNumber = " + soughtNumber);
        run();
        System.out.println("BinarySearch is finish!!!");
    }

    public void run(){

        System.out.println("LIST: " + sortedList);

        int startIndex = 0;
        int endIndex = sortedList.size();
        int middleIndex;

        while (startIndex < endIndex) {
            middleIndex = (startIndex + endIndex) / 2;
            System.out.println("middle index = " + middleIndex + "middle element" + sortedList.get(middleIndex));
            if (sortedList.get(middleIndex) == soughtNumber) {
                System.out.println("Index sought number is " + middleIndex);
                return;
            }
            if (soughtNumber > sortedList.get(middleIndex)) {
                System.out.println(soughtNumber + " > " + sortedList.get(middleIndex));
                startIndex = middleIndex + 1;
            } else {
                System.out.println(soughtNumber + " < " + sortedList.get(middleIndex));
                endIndex = middleIndex - 1;
            }
        }
        System.out.println("No element");
    }
}
