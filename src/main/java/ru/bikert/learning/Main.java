package ru.bikert.learning;

import ru.bikert.learning.lesson02.BubbleSort;
import ru.bikert.learning.lesson02.Sorting;
import ru.bikert.learning.lesson1.BinarySearcher;
import ru.bikert.learning.lesson1.BinarySearcherRecursion;
import ru.bikert.learning.lesson1.LinearSearcher;
import ru.bikert.learning.lesson1.Searcher;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> sortedList = CollectionHelper.getIntegerSortedList(10);
        Searcher searcher = new BinarySearcherRecursion();
        System.out.println(searcher.searchIndex(sortedList, sortedList.get(5)));

//        List<Integer> list = CollectionHelper.getIntegerList(10);
//        Sorting bubbleSort = new BubbleSort();
//        bubbleSort.ascendingSort(list);

    }

}
