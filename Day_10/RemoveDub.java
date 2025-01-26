class RemoveDub{
    public  static int dublicate(int []arr,int  n){
        int i,j=0;
        if(n==0){
            System.out.println("Array is empty");
            return 0;
        }
        for(i=1;i<n;i++ ){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
        return  j+1;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2, 2, 3, 4,5,5};
        int n = arr.length;
        int n1=dublicate(arr, n);
        for(int i=0;i<n1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}