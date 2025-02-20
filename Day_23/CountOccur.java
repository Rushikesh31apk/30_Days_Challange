import java.util.HashMap;
import java.util.LinkedHashMap;

class CountOccur{
    public static void main(String[] args) {
        String str="programming";
        HashMap<Character,Integer> count=new LinkedHashMap<>();
        for(char c:str.toCharArray()) {
            count.put(c, count.getOrDefault(c,0)+1);
        }
        System.err.println(count);

         for (char c : str.toCharArray()) {
            if (count.containsKey(c)) {
                System.out.println(c + ":" + count.get(c) + " ");
                count.remove(c); // Ensures each character prints only once
            }
        }
    }
}