

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashmapDemo {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        
        // put(K key, V value)
        hashMap.put("1", "Apple");

        // putAll(Map<? extends K, ? extends V> m)
        Map<String, String> fruits = Map.of("2", "Banana", "3", "Cherry");
        hashMap.putAll(fruits);

        // clear()
        // hashMap.clear();

        // containsKey(Object key)
        System.out.println(hashMap.containsKey("1")); // true

        // containsValue(Object value)
        System.out.println(hashMap.containsValue("Apple")); // true

        // entrySet()
        Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // get(Object key)
        System.out.println(hashMap.get("1")); // Apple

        // isEmpty()
        System.out.println(hashMap.isEmpty()); // false

        // keySet()
        Set<String> keySet = hashMap.keySet();
        for (String key : keySet) {
            System.out.println(key);
        }

        // remove(Object key)
        hashMap.remove("2");

        // size()
        System.out.println(hashMap.size()); // 2

        // values()
        for (String value : hashMap.values()) {
            System.out.println(value);
        }

        // putIfAbsent(K key, V value)
        hashMap.putIfAbsent("4", "Date");

        // toArray()
        // Object[] array = hashMap.toArray();
        // for (Object item : array) {
        //     System.out.println(item);
        // }

        // toArray(T[] a) - Not available in HashMap
    }
}

