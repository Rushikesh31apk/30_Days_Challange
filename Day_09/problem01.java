import java.util.*;
class problem01{
    public static void main(String[] args) {

        //First apporch without using collection
        String str= "shikesh";
        System.out.print("First Unique characters in string:");
        for(int i=0;i<str.length();i++){
            boolean unique=true;
            for(int j=0;j<str.length();j++){
                if(i != j && str.charAt(i) == str.charAt(j)){
                    unique=false;
                    break;
                }
            }
            if(unique){
                System.out.print(str.charAt(i));
                break;
            }
        }
        System.out.println("\n");
        //Second approach using set
        String str1= "shikesh";
        Map<Character, Integer> map = new LinkedHashMap<>();
        
        // Count the frequency of each character
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);

        // Find the first character with frequency 1
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeated character: " + entry.getKey());
                break;
            }
        }

    }
}