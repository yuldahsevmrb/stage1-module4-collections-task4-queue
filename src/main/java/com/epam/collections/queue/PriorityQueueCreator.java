package com.epam.collections.queue;

import java.util.*;
import java.util.stream.Collectors;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {

        PriorityQueue<String> result = new PriorityQueue<>( Comparator.reverseOrder());
        result.addAll(firstList);
        result.addAll(secondList);
        return result;
    }
}
