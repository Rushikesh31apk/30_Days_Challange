import java.util.LinkedHashSet;
import java.util.Set;
class problem03 {
    public static void main(String[] args) {
        // Remove duplicate characters from the string
        String s = "Rushikesh";
        //First Approch
        StringBuilder s1 = new StringBuilder();
        s.chars().distinct().forEach(c -> s1.append((char) c));
        System.out.println(s1);

        //Second Approch
        StringBuilder s2 = new StringBuilder();
        for (int i=0;i< s.length();i++){
            char ch= s.charAt(i);
            int idx= s.indexOf(ch,i+1); //check whether they present or not
            if(idx==-1){
                s2.append(ch);
            }
        }
        System.out.println(s2);

        //Third approch
        char []dum= s.toCharArray();
        StringBuilder s3 = new StringBuilder();
        for (int i=0;i< s.length();i++){
            boolean seen=false;
            for (int j=i+1;j< s.length();j++){
                if(dum[i]==dum[j]){
                    seen=true;
                    break;
                }
            }
            if(!seen){
                s3.append(dum[i]);
            }
        }
        System.out.println(s3);

        //Fourth approch
        StringBuilder s4 = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();
        for (int i=0;i< s.length();i++){
            set.add(s.charAt(i));
        }
        for (Character ch : set) {
            s4.append(ch);
        }
        System.out.println(s4);

    }
}
