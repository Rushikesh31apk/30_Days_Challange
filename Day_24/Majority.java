class Majority{

    public static int majorityEle(int arr[],int n){
        int cnt=0;
        for(int i=0;i<n;i++){
            cnt=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    cnt++;
                }
            }
            if(cnt>(n/2)){ 
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int []nums = {2,2,1,1,1,2,2};
        System.out.println("Majority element in arr: "+majorityEle(nums,nums.length));

    }
}