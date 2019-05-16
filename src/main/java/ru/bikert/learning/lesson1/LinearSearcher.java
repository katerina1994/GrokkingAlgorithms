package ru.bikert.learning.lesson1;

import ru.bikert.learning.ConsoleLogger;
import ru.bikert.learning.Logger;

import java.util.List;

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
