
import java.util.LinkedHashSet;
import java.util.Set;

class removedub{
    public static void main(String[] args) {
        String st= "banana";
        Set<Character> seen= new LinkedHashSet();
        for(char i: st.toCharArray()){
            seen.add(i);
        }
        String result="";
        for(char a: seen){
            result +=a;
        }
        System.err.println("after removing dublicate: "+result);
    }
}