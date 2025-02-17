import java.util.Arrays;

class anagram{
    public static boolean isAnagram(String str1, String str2){
        char s1[]=str1.toCharArray();
        char s2[]=str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1, s2);
    }
    public static void main(String[] args) {
        if(isAnagram("silent", "listen")){
            System.err.println("This is Anagram Strings!");
        }else{
            System.err.println("This is not a Anagram Strings!");
        }
        
    }
}