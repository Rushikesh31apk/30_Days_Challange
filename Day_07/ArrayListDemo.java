import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        
        // add(E e)
        arrayList.add("Apple");

        // add(int index, E element)
        arrayList.add(1, "Banana");

        // addAll(Collection<? extends E> c)
        List<String> fruits = List.of("Cherry", "Date");
        arrayList.addAll(fruits);

        // addAll(int index, Collection<? extends E> c)
        List<String> tropicalFruits = List.of("Mango", "Papaya");
        arrayList.addAll(1, tropicalFruits);

        // clear()
        // arrayList.clear();

        // contains(Object o)
        System.out.println(arrayList.contains("Apple")); // true

        // get(int index)
        System.out.println(arrayList.get(0)); // Apple

        // indexOf(Object o)
        System.out.println(arrayList.indexOf("Banana")); // 1

        // isEmpty()
        System.out.println(arrayList.isEmpty()); // false

        // lastIndexOf(Object o)
        System.out.println(arrayList.lastIndexOf("Papaya")); // 5

        // listIterator()
        ListIterator<String> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next());
        }

        // listIterator(int index)
        ListIterator<String> listIteratorFromIndex = arrayList.listIterator(2);
        while (listIteratorFromIndex.hasNext()) {
            System.out.println(listIteratorFromIndex.next());
        }

        // remove(Object o)
        arrayList.remove("Cherry");

        // remove(int index)
        arrayList.remove(0);

        // removeAll(Collection<?> c)
        arrayList.removeAll(fruits);

        // retainAll(Collection<?> c)
        arrayList.retainAll(tropicalFruits);

        // set(int index, E element)
        arrayList.set(0, "Pineapple");

        // size()
        System.out.println(arrayList.size()); // 2

        // subList(int fromIndex, int toIndex)
        List<String> subList = arrayList.subList(0, 1);
        System.out.println(subList); // [Pineapple]

        // toArray()
        Object[] array = arrayList.toArray();
        for (Object item : array) {
            System.out.println(item);
        }

        // toArray(T[] a)
        String[] strArray = arrayList.toArray(new String[0]);
        for (String item : strArray) {
            System.out.println(item);
        }
    }
}

