
import java.util.HashMap;
import java.util.LinkedHashMap;

class countfreq{
    public static void main(String[] args) {
        String str="hello";
        HashMap<Character,Integer> count =new LinkedHashMap();
        for(char ch:str.toCharArray()){
            count.put(ch, count.getOrDefault(ch, 0)+1);
        }
        System.err.println(count);
    }
}