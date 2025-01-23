package ColeectionInJava;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<String> priorityQueue = new PriorityQueue<>();
        
        // add(E e)
        priorityQueue.add("Apple");

        // offer(E e)
        priorityQueue.offer("Banana");

        // clear()
        // priorityQueue.clear();

        // contains(Object o)
        System.out.println(priorityQueue.contains("Apple")); // true

        // peek()
        System.out.println(priorityQueue.peek()); // Apple (highest priority)

        // poll()
        System.out.println(priorityQueue.poll()); // Apple (highest priority removed)

        // remove(Object o)
        priorityQueue.remove("Banana");

        // removeAll(Collection<?> c)
        // priorityQueue.removeAll(fruits); // Requires fruits collection

        // retainAll(Collection<?> c)
        // priorityQueue.retainAll(fruits); // Requires fruits collection

        // size()
        System.out.println(priorityQueue.size()); // 0

        // toArray()
        Object[] array = priorityQueue.toArray();
        for (Object item : array) {
            System.out.println(item);
        }

        // toArray(T[] a)
        String[] strArray = priorityQueue.toArray(new String[0]);
        for (String item : strArray) {
            System.out.println(item);
        }
    }
}
