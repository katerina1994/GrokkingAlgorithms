package ru.bikert.learning;

import ru.bikert.learning.lesson1.LinearSearcher;
import ru.bikert.learning.lesson1.Searcher;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> sortedList = CollectionHelper.getIntegerSortedList(100);
        Searcher searcher = new LinearSearcher(null);
        searcher.searchIndex(sortedList, 22);

    }

}
