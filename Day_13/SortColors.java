
import java.util.Arrays;

class  SortColors{
    // 1st brute force approach
    public static void sortColors(int[] nums) {
        Arrays.sort(nums);
    }
    // 2nd optimized approach using counting sort
    public static void sortColors2(int[] nums) {
        int[] count = new int[5];
        int max=0;
        for (int num : nums) {
            count[num]++;
            if( max < num){
                max = num;
            }
        }//this is comment
        // int index = 0;
        // for (int i = 0; i <= max; i++) {
        //     while (count[i] > 0) {
        //         nums[index++] = i;
        //         count[i]--;
        //         }
        // }


        // 2,0,2,1,1,0,0,1,2,1
        int index = 0;
        for (int i = 0; i <= max; i++) {
            for (int j = 0; j < count[i]; j++) {
                nums[index++] = i;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,1,2,3,2,1,3,0};
        sortColors2(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}