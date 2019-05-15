package ru.bikert.learning.lesson1;

import java.util.List;

public interface Searcher {
    <T extends Comparable<T>> int SearchIndex(List<T> sortedList, T target);
}
