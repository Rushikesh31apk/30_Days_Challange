

public class revString {

    public static String reverseString(String s) {
        if (s.isEmpty()) {
            return s;
        } else {
            return reverseString(s.substring(1)) + s.charAt(0);
        }
    }
    public static void main(String[] args) {
        String a="Rushikesh";
        System.out.println("Before rev:  "+a);
        a=reverseString(a);
        System.out.println("After rev:  "+a);
    }
    
}
