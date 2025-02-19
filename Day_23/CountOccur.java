
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

class CountOccur{
    public static void main(String[] args) {
        String str="programming";
        HashMap<Character,Integer> count=new LinkedHashMap<>();
        for(char c:str.toCharArray()) count.put(c, count.getOrDefault(c,0)+1);
        System.err.println(count);

        List<Integer> arr= new ArrayList<>();
        arr.add(23);
        arr.add(12);
        arr.add(43);
        arr.forEach(System.out::println);
        
         for (char c : str.toCharArray()) {
            if (count.containsKey(c)) {
                System.out.print(c + ":" + count.get(c) + " ");
                count.remove(c); // Ensures each character prints only once
            }
        }
    }
}