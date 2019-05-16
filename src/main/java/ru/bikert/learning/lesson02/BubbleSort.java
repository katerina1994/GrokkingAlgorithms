package ru.bikert.learning.lesson02;

import ru.bikert.learning.CollectionHelper;

import java.util.List;

public class BubbleSort {

    final int SIZE_COLLECTION = 10;
    List<Integer> list;

    public BubbleSort() {
        list = CollectionHelper.getIntegerList(SIZE_COLLECTION);
        run();
    }

    private void run() {

        for (int i = 0; i<list.size(); i++){
            int number = list.get(i);
            for (int j = i-1; j>=0; j--) {
                int leftNumber = list.get(j);
                if (number > leftNumber) {
                    break;
                } else {
                    list.remove(j+1);
                    list.add(j+1, leftNumber);
                    list.remove(j);
                    list.add(j, number);
                }
            }
            System.out.println(list);
        }
        System.out.println("List" + list);
    }
}
