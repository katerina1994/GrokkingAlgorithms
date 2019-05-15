package ru.bikert.learning;

import ru.bikert.learning.lesson1.BinarySearch;
import ru.bikert.learning.lesson1.LinearSearch;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> sortedList = CollectionHelper.getIntegerSortedList(100);

        BinarySearch binarySearch = new BinarySearch(25, 100);
        LinearSearch linearSearch = new LinearSearch(25, 100);
    }
}
