class Gcd{
    public static int GCD(int a, int b){
        if( b==0){
            return a;
        }
        return GCD(b,a%b);
    }
    public static int LCM(int a, int b){
        return a*b/GCD(a,b);
    }
    public static void main(String[] args) {
        System.err.println("Gcd of two num: "+GCD(10,25)+" And Lcm of two num: "+LCM(10, 25));

        
    }
}