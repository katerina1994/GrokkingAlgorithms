package ru.bikert.learning.lesson02;

import ru.bikert.learning.ConsoleLogger;
import ru.bikert.learning.Logger;

import java.util.List;

public class BubbleSort implements Sorting {

    Logger logger;

    public BubbleSort(Logger logger) {
        this.logger = logger;
    }

    public BubbleSort() {
        this.logger = new ConsoleLogger();
    }

    @Override
    public  <T extends Comparable<T>> void ascendingSort(List<T> list) {

        for (int i = 0; i<list.size(); i++){
            T value = list.get(i);
            for (int j = i-1; j>=0; j--) {
                T leftValue = list.get(j);
                if (value.compareTo(leftValue) > 0) {
                    break;
                } else {
                    list.remove(j+1);
                    list.add(j+1, leftValue);
                    list.remove(j);
                    list.add(j, value);
                }
            }
            logger.log(list.toString());
        }
        logger.log("List" + list);
    }
}
