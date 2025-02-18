// Reverce string in java
public class problem01 {
    public static void main(String[] args) {
        String str = "Hello";
        //First Approch use charAt
        int n = str.length();
        String rev = "";
        for(int i = n-1; i>=0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
        
        //Second approch use array
        char [] ch= str.toCharArray();
        String r="";
        for(int i=ch.length-1;i>=0;i--){
            r=r+ch[i];
            //System.out.print(ch[i]);
        }
        System.out.println(r);

        //Third approch use StringBuffer
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

        //Fourth approch use StringBuilder
        String revStr = new StringBuilder(str).reverse().toString();
        System.out.println(revStr);

        
    }
}