
import java.util.HashMap;
import java.util.LinkedHashMap;

class countfreq{
    public static void main(String[] args) {
        String str="hello";
        HashMap<Character,Integer> count =new LinkedHashMap();
        for(char ch:str.toCharArray()){
            if(!count.containsKey(ch)){count.put(ch, 1);}
            else{
                int cnt=count.get(ch);
                count.put(ch, cnt+1);
            }
        }
        System.err.println(count);

        
    }
}