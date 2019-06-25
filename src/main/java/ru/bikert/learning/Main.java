package ru.bikert.learning;

import ru.bikert.learning.lesson02.BubbleSort;
import ru.bikert.learning.lesson02.Sorting;
import ru.bikert.learning.lesson1.BinarySearcher;
import ru.bikert.learning.lesson1.BinarySearcherRecursion;
import ru.bikert.learning.lesson1.LinearSearcher;
import ru.bikert.learning.lesson1.Searcher;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        List<Integer> sortedList = CollectionHelper.getIntegerSortedList(10);
        Searcher searcher = new BinarySearcherRecursion();
        System.out.println(searcher.searchIndex(sortedList, sortedList.get(5)));

//        List<Integer> list = CollectionHelper.getIntegerList(10);
//        Sorting bubbleSort = new BubbleSort();
//        bubbleSort.ascendingSort(list);
        Scanner scanner = new Scanner(System.in);
        Integer a;
        List<Integer> list = new ArrayList<>();
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
        } else {
            System.out.println("Введите число");
            return;
        }
        try {
            for (int i = 0; i < a; i++) {
                if (scanner.hasNextInt()) {
                    list.add(Integer.valueOf(scanner.next()));
                }
            }
            counter(list);
            scanner.close();
        } catch (NumberFormatException e) {
            System.out.println("Введите последовательность чисел");
        }
    }

    static void counter(List<Integer> list) {
        int result = 1;
        while (list.size() != 0) {
            int i = list.stream().min(Integer::compare).get();
            System.out.println(i);
            if (i == list.get(0)) {
                list.remove(0);
            } else {
                list.add(list.get(0));
                list.remove(0);
            }
            result++;
        }
        System.out.println(result);
    }

}
