

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        
        // add(E e)
        hashSet.add("Apple");

        // addAll(Collection<? extends E> c)
        Set<String> fruits = Set.of("Banana", "Cherry");
        hashSet.addAll(fruits);

        // clear()
        // hashSet.clear();

        // contains(Object o)
        System.out.println(hashSet.contains("Apple")); // true

        // isEmpty()
        System.out.println(hashSet.isEmpty()); // false

        // iterator()
        for (String item : hashSet) {
            System.out.println(item);
        }

        // remove(Object o)
        hashSet.remove("Cherry");

        // removeAll(Collection<?> c)
        hashSet.removeAll(fruits);

        // retainAll(Collection<?> c)
        hashSet.retainAll(fruits);

        // size()
        System.out.println(hashSet.size()); // 1

        // toArray()
        Object[] array = hashSet.toArray();
        for (Object item : array) {
            System.out.println(item);
        }

        // toArray(T[] a)
        String[] strArray = hashSet.toArray(new String[0]);
        for (String item : strArray) {
            System.out.println(item);
        }
    }
}

