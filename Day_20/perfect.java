class perfect{
    public static void main(String[] args) {
        int n=28;
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i == 0) sum+=i;
        }
        System.out.println(n + " is " +((sum == n) ? "Perfect Number" : "Not perfect number") );
    }
}