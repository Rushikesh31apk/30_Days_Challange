class problem01{
    public static void main(String[] args) {
        String str= "rushikesh";
        System.out.print("Unique characters in string:");
        for(int i=0;i<str.length();i++){
            boolean unique=true;
            for(int j=0;j<str.length();j++){
                if(i != j && str.charAt(i) == str.charAt(j)){
                    unique=false;
                    break;
                }
            }
            if(unique){
                System.out.print(str.charAt(i));
            }
        }
    }
}