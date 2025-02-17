class freq{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1};
        int n= arr.length;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=i;j<n;j++){
                if(arr[i] == arr[j]){
                    cnt++;
                }
            }
            System.err.println((i+1)+" found "+cnt+" times");
        }
    }
}