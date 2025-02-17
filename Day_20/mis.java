class mis{
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        int n= arr.length+1;
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        sum= n*(n+1)/2 - sum;
        System.err.println("missing number is: "+sum);
    }
}