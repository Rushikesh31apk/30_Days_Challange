class prime{
    public static boolean isPrime(int num){
        if(num <= 1) return false;
        if(num <= 3) return true;
        for(int i=2;i<= num/2;i++){
            if(num%i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.err.println("Here is the prime num between 1 to 100: ");
        for(int i=0;i<100;i++){
            if(isPrime(i)) System.err.print(i+" ");
        }
    }
}