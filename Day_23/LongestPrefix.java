import java.util.Arrays;
class LongestPrefix{
    public static void commanprefix(String []str){
        if(str.length == 0){
            System.out.println("No any Strings!");
            return;
        }
        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length-1];
        int i=0;
        while(i<first.length() && i<last.length() && first.charAt(i)==last.charAt(i)){
            i++;
        }
        System.out.println("Longest Prefix String: "+first.substring(0,i));
    }
    public static void main(String[] args){
        String[] strs = {"flower", "flow", "flight"};
        commanprefix(strs);

    }
}