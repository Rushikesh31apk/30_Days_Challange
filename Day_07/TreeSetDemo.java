package ColeectionInJava;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        
        // add(E e)
        treeSet.add("Apple");

        // addAll(Collection<? extends E> c)
        Set<String> fruits = Set.of("Banana", "Cherry");
        treeSet.addAll(fruits);

        // clear()
        // treeSet.clear();

        // contains(Object o)
        System.out.println(treeSet.contains("Apple")); // true

        // first()
        System.out.println(((TreeSet<String>) treeSet).first()); // Apple

        // last()
        System.out.println(((TreeSet<String>) treeSet).last()); // Cherry

        // headSet(E toElement)
        Set<String> headSet = ((TreeSet<String>) treeSet).headSet("Cherry");
        System.out.println(headSet); // [Apple, Banana]

        // isEmpty()
        System.out.println(treeSet.isEmpty()); // false

        // iterator()
        for (String item : treeSet) {
            System.out.println(item);
        }

        // lastIndexOf(Object o) - Not available in TreeSet

        // remove(Object o)
        treeSet.remove("Cherry");

        // removeAll(Collection<?> c)
        treeSet.removeAll(fruits);

        // retainAll(Collection<?> c)
        treeSet.retainAll(fruits);

        // size()
        System.out.println(treeSet.size()); // 1

        // subSet(E fromElement, E toElement)
        Set<String> subSet = ((TreeSet<String>) treeSet).subSet("Apple", "Cherry");
        System.out.println(subSet); // [Apple]

        // tailSet(E fromElement)
        Set<String> tailSet = ((TreeSet<String>) treeSet).tailSet("Apple");
        System.out.println(tailSet); // [Apple]

        // toArray()
        Object[] array = treeSet.toArray();
        for (Object item : array) {
            System.out.println(item);
        }

        // toArray(T[] a)
        String[] strArray = treeSet.toArray(new String[0]);
        for (String item : strArray) {
            System.out.println(item);
        }
    }
}
