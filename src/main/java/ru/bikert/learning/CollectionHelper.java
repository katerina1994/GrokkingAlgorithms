package ru.bikert.learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionHelper {


    public static List<Double> getDoubleSortedList(int size){
        List<Double> list = getDoubleList(size);
        Collections.sort(list);
        return list;
    }

    public static List<Double> getDoubleList(int size) {
        List<Double> result = new ArrayList<>(size);
        for (int i = 0; i < size; i++){
            result.add(Math.random());
        }
        return result;
    }

    public static List<Integer> getIntegerSortedList(int size){
        List<Integer> result = getIntegerList(size);
        Collections.sort(result);
        return result;
    }

    public static List<Integer> getIntegerList(int size){
        List<Integer> result = new ArrayList<>(size);
        for (int i = 0; i < size; i++){
            result.add((int) (Math.random() * 100));
        }
        return result;
    }

}
