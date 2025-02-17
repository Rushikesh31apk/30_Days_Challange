class paliNum{
    public static Boolean isPali(int num){
        int temp=num;
        int rev=0;
        while(temp != 0){
            rev = (rev*10)+(temp%10);
            temp/=10;
        }
        return num == rev;
    }
    public static void main(String[] args) {
    System.err.println("Give num is palindrom?: "+isPali(1291));
        
    }
}