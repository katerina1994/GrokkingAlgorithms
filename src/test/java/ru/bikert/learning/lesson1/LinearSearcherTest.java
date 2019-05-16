package ru.bikert.learning.lesson1;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LinearSearcherTest extends TestCase {

    private final List<Integer> defaultList = Arrays.asList(1,2,2,3,4,5,6,4,7,8,9);

    private static final Map<Integer, Integer> toSearchIndexData = new HashMap<>();

    @Test
    public void testSearchIndex() throws Exception {

        Searcher searcher = new LinearSearcher(null);

        for (Map.Entry<Integer, Integer> entry : toSearchIndexData.entrySet()){
            Integer result = searcher.searchIndex(defaultList, entry.getValue());
            System.out.println("Result: " + result + " expected: " + entry.getKey());
            assertEquals(result,entry.getKey());
        }

    }

    @After
    public static void tearDownToSearchIndexData() {
        toSearchIndexData.clear();
    }

    @Before
    public void setUp() throws Exception {
        toSearchIndexData.put(3, 3);
        toSearchIndexData.put(6, 6);
        toSearchIndexData.put(-1, 0);
    }
}