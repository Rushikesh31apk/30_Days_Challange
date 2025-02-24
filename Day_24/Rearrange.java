class Rearrange{
    public static int[] sol(int arr[],int n) {
        int pos[]=new int[n];
        int neg[]=new int[n];
        int j=0,k=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>= 0){pos[k++]=arr[i];}
            else{neg[j++]=arr[i];}
        }
        for(int i=0;i<n/2;i++){
            arr[i*2]=pos[i];
            arr[i*2+1]=neg[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int []nums = {3,1,-2,-5,2,-4};
        nums=sol(nums, nums.length);
        for (int i = 0; i < nums.length; i++) {
            System.err.print(nums[i]+" ");
        }

        
    }
}