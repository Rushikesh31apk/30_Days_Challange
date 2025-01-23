package ColeectionInJava;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        
        // add(E e)
        linkedList.add("Apple");

        // add(int index, E element)
        linkedList.add(1, "Banana");

        // addAll(Collection<? extends E> c)
        List<String> fruits = List.of("Cherry", "Date");
        linkedList.addAll(fruits);

        // addAll(int index, Collection<? extends E> c)
        List<String> tropicalFruits = List.of("Mango", "Papaya");
        linkedList.addAll(1, tropicalFruits);

        // addFirst(E e)
        ((LinkedList<String>) linkedList).addFirst("Apricot");

        // addLast(E e)
        ((LinkedList<String>) linkedList).addLast("Blueberry");

        // clear()
        // linkedList.clear();

        // contains(Object o)
        System.out.println(linkedList.contains("Apple")); // true

        // get(int index)
        System.out.println(linkedList.get(0)); // Apricot

        // getFirst()
        System.out.println(((LinkedList<String>) linkedList).getFirst()); // Apricot

        // getLast()
        System.out.println(((LinkedList<String>) linkedList).getLast()); // Blueberry

        // indexOf(Object o)
        System.out.println(linkedList.indexOf("Banana")); // 2

        // isEmpty()
        System.out.println(linkedList.isEmpty()); // false

        // lastIndexOf(Object o)
        System.out.println(linkedList.lastIndexOf("Papaya")); // 6

        // listIterator()
        ListIterator<String> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // listIterator(int index)
        ListIterator<String> listIteratorFromIndex = linkedList.listIterator(2);
        while (listIteratorFromIndex.hasNext()) {
            System.out.println(listIteratorFromIndex.next());
        }

        // remove(Object o)
        linkedList.remove("Cherry");

        // remove(int index)
        linkedList.remove(0);

        // removeFirst()
        ((LinkedList<String>) linkedList).removeFirst();

        // removeLast()
        ((LinkedList<String>) linkedList).removeLast();

        // removeAll(Collection<?> c)
        linkedList.removeAll(fruits);

        // retainAll(Collection<?> c)
        linkedList.retainAll(tropicalFruits);

        // set(int index, E element)
        linkedList.set(0, "Pineapple");

        // size()
        System.out.println(linkedList.size()); // 2

        // subList(int fromIndex, int toIndex)
        List<String> subList = linkedList.subList(0, 1);
        System.out.println(subList); // [Pineapple]

        // toArray()
        Object[] array = linkedList.toArray();
        for (Object item : array) {
            System.out.println(item);
        }

        // toArray(T[] a)
        String[] strArray = linkedList.toArray(new String[0]);
        for (String item : strArray) {
            System.out.println(item);
        }
    }
}
