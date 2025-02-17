class sumOfDigit{
    public static void main(String[] args) {
        int num=12345;
        int sum=0;
        while(num != 0){
            sum+=num%10;
            num/=10;
        }
        System.err.println("Sum of each digit in num is: "+sum);
    }
}