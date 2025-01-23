package ColeectionInJava;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        
        // put(K key, V value)
        linkedHashMap.put("1", "Apple");

        // putAll(Map<? extends K, ? extends V> m)
        Map<String, String> fruits = Map.of("2", "Banana", "3", "Cherry");
        linkedHashMap.putAll(fruits);

        // clear()
        // linkedHashMap.clear();

        // containsKey(Object key)
        System.out.println(linkedHashMap.containsKey("1")); // true

        // containsValue(Object value)
        System.out.println(linkedHashMap.containsValue("Apple")); // true

        // entrySet()
        Set<Map.Entry<String, String>> entrySet = linkedHashMap.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // get(Object key)
        System.out.println(linkedHashMap.get("1")); // Apple

        // isEmpty()
        System.out.println(linkedHashMap.isEmpty()); // false

        // keySet()
        Set<String> keySet = linkedHashMap.keySet();
        for (String key : keySet) {
            System.out.println(key);
        }

        // remove(Object key)
        linkedHashMap.remove("2");

        // size()
        System.out.println(linkedHashMap.size()); // 2

        // values()
        for (String value : linkedHashMap.values()) {
            System.out.println(value);
        }

        // putIfAbsent(K key, V value)
        linkedHashMap.putIfAbsent("4", "Date");

        // toArray()
        Object[] array = linkedHashMap.values().toArray();
        for (Object item : array) {
            System.out.println(item);
        }

        // toArray(T[] a) - Not available in LinkedHashMap
    }
}
