class problem02{
    public static void main(String[] args) {
        String str = "java code";
        String []words= str.split(" ");
        String revWords="";
        for( String word : words) {
            for(int i=word.length()-1;i>=0;i--){
                revWords+=word.charAt(i);
            }
            revWords+=" ";
        }
        System.out.println("before perform any operation each word like: "+str);
        System.out.println("after perform op each word in reverce postion: "+revWords);
            
    }
}