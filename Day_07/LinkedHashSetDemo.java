package ColeectionInJava;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>();
        
        // add(E e)
        linkedHashSet.add("Apple");

        // addAll(Collection<? extends E> c)
        Set<String> fruits = Set.of("Banana", "Cherry");
        linkedHashSet.addAll(fruits);

        // clear()
        // linkedHashSet.clear();

        // contains(Object o)
        System.out.println(linkedHashSet.contains("Apple")); // true

        // isEmpty()
        System.out.println(linkedHashSet.isEmpty()); // false

        // iterator()
        for (String item : linkedHashSet) {
            System.out.println(item);
        }

        // remove(Object o)
        linkedHashSet.remove("Cherry");

        // removeAll(Collection<?> c)
        linkedHashSet.removeAll(fruits);

        // retainAll(Collection<?> c)
        linkedHashSet.retainAll(fruits);

        // size()
        System.out.println(linkedHashSet.size()); // 1

        // toArray()
        Object[] array = linkedHashSet.toArray();
        for (Object item : array) {
            System.out.println(item);
        }

        // toArray(T[] a)
        String[] strArray = linkedHashSet.toArray(new String[0]);
        for (String item : strArray) {
            System.out.println(item);
        }
    }
}
