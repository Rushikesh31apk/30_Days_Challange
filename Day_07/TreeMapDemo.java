package ColeectionInJava;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String, String> treeMap = new TreeMap<>();
        
        // put(K key, V value)
        treeMap.put("1", "Apple");

        // putAll(Map<? extends K, ? extends V> m)
        Map<String, String> fruits = Map.of("2", "Banana", "3", "Cherry");
        treeMap.putAll(fruits);

        // clear()
        // treeMap.clear();

        // containsKey(Object key)
        System.out.println(treeMap.containsKey("1")); // true

        // containsValue(Object value)
        System.out.println(treeMap.containsValue("Apple")); // true

        // entrySet()
        Set<Map.Entry<String, String>> entrySet = treeMap.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // get(Object key)
        System.out.println(treeMap.get("1")); // Apple

        // isEmpty()
        System.out.println(treeMap.isEmpty()); // false

        // keySet()
        Set<String> keySet = treeMap.keySet();
        for (String key : keySet) {
            System.out.println(key);
        }

        // remove(Object key)
        treeMap.remove("2");

        // size()
        System.out.println(treeMap.size()); // 2

        // values()
        for (String value : treeMap.values()) {
            System.out.println(value);
        }

        // putIfAbsent(K key, V value)
        treeMap.putIfAbsent("4", "Date");

        // firstKey()
        System.out.println(((TreeMap<String, String>) treeMap).firstKey()); // 1

        // lastKey()
        System.out.println(((TreeMap<String, String>) treeMap).lastKey()); // 3

        // headMap(K toKey)
        Map<String, String> headMap = ((TreeMap<String, String>) treeMap).headMap("3");
        System.out.println(headMap); // {1=Apple}

        // tailMap(K fromKey)
        Map<String, String> tailMap = ((TreeMap<String, String>) treeMap).tailMap("2");
        System.out.println(tailMap); // {3=Cherry, 4=Date}

        // subMap(K fromKey, K toKey)
        Map<String, String> subMap = ((TreeMap<String, String>) treeMap).subMap("2", "4");
        System.out.println(subMap); // {3=Cherry}

        // toArray()
        Object[] array = treeMap.values().toArray();
        for (Object item : array) {
            System.out.println(item);
        }

        // toArray(T[] a) - Not available in TreeMap
    }
}

