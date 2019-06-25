package ru.bikert.learning.lesson02;

import ru.bikert.learning.Logger;

import java.util.List;

public interface Sorting {
    public  <T extends Comparable<T>> void ascendingSort(List<T> list);

}
