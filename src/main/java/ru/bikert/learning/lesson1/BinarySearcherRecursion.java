package ru.bikert.learning.lesson1;

import ru.bikert.learning.ConsoleLogger;
import ru.bikert.learning.Logger;

import java.util.List;

public class BinarySearcherRecursion implements Searcher {
    Logger logger;

    public BinarySearcherRecursion() {
        this.logger = new ConsoleLogger();
    }

    public BinarySearcherRecursion(Logger logger) {
        this.logger = logger;
    }

    @Override
    public <T extends Comparable<T>> int searchIndex(List<T> sortedList, T target) {
        if (!isSorted(sortedList)) {
            logger.log("List is not sorted");
            return -1;
        }
        logger.log("LIST: " + sortedList);

        return search(sortedList, target, 0, sortedList.size()-1);
    }

    private <T extends Comparable<T>> int search(List<T> sortedList, T target, int start, int end) {
        logger.log("Start: " + start + " End: " + end);
        if(start >= end) return -1;
        int meddle = (end + start) / 2;
        logger.log("center" + meddle);
        int compare = target.compareTo(sortedList.get(meddle));
        logger.log("compare " + compare);
        if (compare == 0)
            return meddle;
        else if (compare < 0)
            return search(sortedList,target,start,meddle-1);
        else
            return search(sortedList,target,meddle+1,end);
    }
}
