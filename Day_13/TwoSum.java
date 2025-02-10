
import java.util.HashMap;

class TwoSum{
    //1 Brute force approch TC= (n^2)
    public static int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
        ans[0]=ans[1]=-1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
    }
    //2 Optimized approach using HashMap
    public static int[] twoSum1(int[] nums, int target) {
        int ans[]=new int[2];
        ans[0]=ans[1]=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                ans[0]=map.get(complement);
                ans[1]=i;
                return ans;
            }
            map.put(nums[i], i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices of the two numbers are " + result[0] + " and " + result[1]);

        System.out.println("");
        int[] result1 = twoSum1(nums, target);
        System.out.println("Indices of the two numbers are " + result1[0] + " and " + result1[1]);

    }

}