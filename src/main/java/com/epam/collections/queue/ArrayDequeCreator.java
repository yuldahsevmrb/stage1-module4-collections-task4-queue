package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> result = new ArrayDeque<>();
        result.add(firstQueue.remove());
        result.add(firstQueue.remove());
        result.add(secondQueue.remove());
        result.add(secondQueue.remove());

        while (!firstQueue.isEmpty()){
            firstQueue.add(result.removeLast());
            result.add(firstQueue.remove());
            result.add(firstQueue.remove());

            secondQueue.add(result.removeLast());
            result.add(secondQueue.remove());
            result.add(secondQueue.remove());
        }

        return result;
    }
}
