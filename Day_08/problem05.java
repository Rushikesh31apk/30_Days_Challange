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
    }
}