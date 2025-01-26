import java.util.*;
class problem04{
    public static void main(String[] args) {
        //sort a string without using inbuilt method
        String str = "rushikesh";
        char[] charArray = str.toCharArray();
        for(int i=0;i<charArray.length;i++){
            for(int j=i+1;j<charArray.length;j++){
                if(charArray[i]>charArray[j]){
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j]=temp;
                }
            }
        }
        System.out.println(charArray);
        
        //using inbuilt method
        String str1 = "rushikesh";
        char[] charArray1 = str1.toCharArray();
        Arrays.sort(charArray1);
        System.out.println(charArray1);
    }

}