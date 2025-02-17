class secLarg{
    public static void main(String[] args) {
        int arr[]={1,2,32,4,2,3,3,2,2,4,2,31,44,44,2,4,32,};
        int first= Integer.MIN_VALUE;
        int second= Integer.MIN_VALUE;
        for(int i: arr){
            if(i>first){
                second=first;
                first=i;
            }else if(i>second && i<first){
                second=i;
            }
        }
        System.err.println("1st Max num of : "+first);
        System.err.println("2nd Max num of : "+second);

    }
}