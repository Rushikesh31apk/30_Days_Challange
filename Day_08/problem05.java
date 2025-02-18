
import java.util.Arrays;

class problem05{
    public static void main(String[] args) {
        //input="rushikesh"
        //output="ru1hike2h"
        //repace with counter++
        String str= "rushikeshrhsgshsfach";
        int count = 1;
        char replace='h';
        if(str.indexOf(replace)==-1){
            System.out.println("This character is not found");
            System.exit(0);
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==replace){
                str=str.replaceFirst(String.valueOf(replace),String.valueOf(count));
                count++;
            }
        }
        System.out.println(str);

        int cnt=0;
        char []arr=str.toCharArray();
        for(int i=0;i<str.length();i++){
            char ch=arr[i];
            if(ch==replace){
                arr[i] = String.valueOf(cnt).charAt(0);
                count++;
            }
        }
        System.err.println(Arrays.toString(arr));
    }
}