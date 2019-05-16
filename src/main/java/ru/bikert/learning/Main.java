package ru.bikert.learning;

import ru.bikert.learning.lesson1.BinarySearcher;
import ru.bikert.learning.lesson1.LinearSearcher;
import ru.bikert.learning.lesson1.Searcher;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Integer> sortedList = CollectionHelper.getIntegerSortedList(100);

        Integer left = 1;
        Integer right = 1;
        System.out.println(left.equals(right));

        Searcher l = new BinarySearcher();
        Searcher r = new BinarySearcher();

        System.out.println(l.equals(r));

        int ll = 1;
        int rr = 2;


        Searcher searcher = BuildSearcher();
        int index = searcher.SearchIndex(sortedList, (int) (Math.random() * 100));

        System.out.println("________________________________________");
        System.out.println(index);

//        LinearSearcher linearSearcher = new LinearSearcher(25, 100);
    }

    public static Searcher BuildSearcher(){
        return new BinarySearcher();
    }
}
