class ArmStrong{
    public static void main(String[] args) {
        int num=153;
        int n= Integer.toString(num).length();
        int temp=num;
        int sum=0;
        while(temp !=0){
            sum+=Math.pow(temp%10, n);
            temp/=10;          
        }
        if (sum == num) {
            System.err.println("Given Num is ArmStrong");
        }        
    }
}