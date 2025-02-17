class maxArr{
    public static void main(String[] args) {
        int arr[]={1,3,33,13,14,34,1,42,12,0,11,9};
        int max= Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        for(int num: arr){
            if(num > max) max=num;
            if(num < min) min=num;
        }
        System.err.println("Max num is: "+max);
        System.err.println("Min num is: "+min);
    }
}