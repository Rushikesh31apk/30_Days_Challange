class MoveZeroes{
    //solution
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }
        //fill the rest of the array with zeroes
        while (count < n) {
            nums[count++] = 0;
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12,11,13,0,12};
        moveZeroes(arr);
        System.err.println("All zeroes moved to the end");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}