// reverce string in java
public class problem01 {
    public static void main(String[] args) {
        String str = "Hello";
        //First Approch
        int n = str.length();
        String rev = "";
        for(int i = n-1; i>=0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
        
        //Second approch
        char [] ch= str.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }

        
    }
}