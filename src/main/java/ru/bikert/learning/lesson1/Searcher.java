package ru.bikert.learning.lesson1;

import java.util.List;
import java.util.stream.Collectors;

public interface Searcher {
    <T extends Comparable<T>> int searchIndex(List<T> sortedList, T target);

    default <T> Boolean isSorted(List<T> list){
        return list.stream().sorted().collect(Collectors.toList()).equals(list);
    }
}
