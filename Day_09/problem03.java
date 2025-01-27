import java.util.*;

class problem03{
    public static void main(String[] args) {
        // longest unique char substring
        String str = "rushikesh";
        String longestSubString = null;
        int longestSubStringlen=0;
        Map<Character, Integer> map=new LinkedHashMap<>();
        char arr[]=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], i);
            }else{
                i=map.get(arr[i]);
                map.clear();
            }
            if(map.size()>longestSubStringlen){
                longestSubStringlen=map.size();
                longestSubString=map.keySet().toString();
            }
        }
        System.out.println(map.keySet().toString());
        System.out.println("Longest unique character substring is: "+longestSubString);
       
    }
        
}