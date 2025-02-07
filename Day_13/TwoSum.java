class TwoSum{
    //1 Brute force approch 
    public static int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
        ans[0]=ans[1]=-1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if( i ==j) continue;
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices of the two numbers are " + result[0] + " and " + result[1]);

    }

}