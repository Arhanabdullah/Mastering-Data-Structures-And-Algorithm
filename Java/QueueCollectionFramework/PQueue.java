package QueueCollectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class PQueue {

    public static void main(String[] args) {
        // Java Queue Collection Framework
        // Priority Queue
        // Time Complexity: O(log n)
        // Space Complexity: O(n)
        // Approach: A priority queue is a data structure that stores elements in a way
        // that allows for efficient retrieval of the highest (or lowest) priority
        // element. In Java, the PriorityQueue class is part of the java.util package
        // and implements a priority queue using a binary heap. The elements in a
        // priority queue are ordered based on their natural ordering or by a Comparator
        // provided at the time of creation. The element with the highest priority is
        // always at the head of the queue, and it can be accessed in constant time.
        // Insertion and removal of elements take logarithmic time due to the underlying
        // heap structure.
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
    }
}
