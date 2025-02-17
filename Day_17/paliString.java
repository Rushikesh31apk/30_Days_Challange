class paliString{
    public static boolean isPaliStr1(String s){
        String str= new StringBuilder(s).reverse().toString();
        return str.equals(s);
    } 
    public static boolean isPaliStr2(String s){
        char str[]=s.toCharArray();
        String rev="";
        for(char c : str){
            rev+=c;
        }
        return rev.equals(s);
    }
    public static boolean isPaliStr3(String s){
        char str[]=s.toCharArray();
        int start=0,end= str.length-1;
        while(start < end){
            if(str[start] != str[end]) return false;
            start++;
            end--;
        }
        return true;
    }


    public static void main(String[] args) {
        System.err.println("Give String is palindrom using approch 1: "+isPaliStr1("mam"));
        System.err.println("Give String is palindrom using approch 2: "+isPaliStr2("mam"));
        System.err.println("Give String is palindrom using approch 3: "+isPaliStr3("mam"));
        
    }
}