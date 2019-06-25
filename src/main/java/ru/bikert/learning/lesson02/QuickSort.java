package ru.bikert.learning.lesson02;

import ru.bikert.learning.ConsoleLogger;
import ru.bikert.learning.Logger;

import java.util.List;

public class QuickSort implements Sorting {

    Logger logger;

    public QuickSort() {
        this.logger = new ConsoleLogger();
    }

    public QuickSort(Logger logger) {
        this.logger = logger;
    }

    @Override
    public <T extends Comparable<T>> void ascendingSort(List<T> list) {

    }
}
