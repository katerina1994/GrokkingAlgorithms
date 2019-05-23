package ru.bikert.learning.lesson1;

import ru.bikert.learning.ConsoleLogger;
import ru.bikert.learning.Logger;

import java.util.List;
import java.util.stream.Collectors;

public class LinearSearcher implements Searcher {

    private final Logger logger;

    public LinearSearcher(Logger logger) {
        if (logger == null) this.logger = new ConsoleLogger();
        else this.logger = logger;
    }

    public LinearSearcher() {
        this.logger = new ConsoleLogger();
    }

    @Override
    public <T extends Comparable<T>> int searchIndex(List<T> sortedList, T target) {

        if(!isSorted(sortedList)){
            logger.log("List is not sorted");
            return -1;
        }

        logger.log("List " + sortedList);
        for (int i = 0; i<sortedList.size(); i++) {
            if (target.compareTo(sortedList.get(i)) == 0) {
                logger.log("it's index :" + i);
                return i;
            }
        }
        logger.log("No element");
        return -1;
    }
}
