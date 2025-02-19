import java.util.Arrays;

class anagram{
    public static boolean isAnagram(String str1, String str2){
        char s1[]=str1.toCharArray();
        char s2[]=str2.toCharArray();
        if(str1.length() != str2.length()) return false;
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1, s2);
    }
    //aproch two
    public static boolean isAnagram1(String s1,String s2){
        if(s1.length() != s2.length()) return false;
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(s2.indexOf(ch) == -1){return  false;}
        }
        return  true;
    }
    public static void main(String[] args) {
        if(isAnagram1("silent", "listen")){
            System.err.println("This is Anagram Strings!");
        }else{
            System.err.println("This is not a Anagram Strings!");
        }
        
    }
}