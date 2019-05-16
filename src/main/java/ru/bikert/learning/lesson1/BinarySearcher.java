package ru.bikert.learning.lesson1;

import ru.bikert.learning.ConsoleLogger;
import ru.bikert.learning.Logger;

import java.util.List;
/*
    Бинарный поиск
 */
public class BinarySearcher implements Searcher {

    // some very important instance injected stuff like loggers, etc...
    private final Logger logger;

    public BinarySearcher(Logger logger){
        this.logger = logger ;
    }

    public BinarySearcher(){
        this(new ConsoleLogger());
    }


    public <T extends Comparable<T>> int searchIndex(List<T> sortedList, T target){

        logger.log("LIST: " + sortedList);

        int startIndex = 0;
        int endIndex = sortedList.size();
        int middleIndex;

        while (startIndex <= endIndex) {
            middleIndex = (startIndex + endIndex) / 2;

            T middleElement = sortedList.get(middleIndex);
            logger.log("middle index: " + middleIndex + ", middle element: " + middleElement);
            if (target.compareTo(middleElement) == 0) {
                logger.log("Index sought number is " + middleIndex);
                return middleIndex;
            }
            if (target.compareTo(middleElement) > 0) {
                logger.log(target + " > " + middleElement);
                startIndex = middleIndex + 1;
            } else {
                logger.log(target + " < " + middleElement);
                endIndex = middleIndex - 1;
            }
        }

        logger.log("No element");
        return -1;
    }
}
