class ConsOnes{
    //consecutive ones in arr
    public static int cnt(int arr[],int n){
        int count = 0;
        int temp=0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                temp+=1;
                if(count<=temp){
                    count=temp;
                }
            }else{
                temp=0;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,0,1,1,1,0,1,1,1,0,1};
        int n = arr.length;
        System.out.println(cnt(arr,n));
    }
}