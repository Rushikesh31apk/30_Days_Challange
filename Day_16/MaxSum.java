class MaxSum{
    public static int maxSum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
    public static void max_sum() { 
        int[] arr = { -2, 1, -3,2,-9, 4, -1,-8,1,-4,2,1,1,1,1,1,-3, 2, 1, -5,-2, 4}; 
        int maxSum = arr[0], currentSum = arr[0]; 
        for (int i = 1; i < arr.length; i++) { 
            currentSum = Math.max(arr[i], currentSum + arr[i]); 
            maxSum = Math.max(maxSum, currentSum); 
        } 
        System.out.println("Max Subarray Sum: " + maxSum); 
    }  
    public static void main(String[] args) {
          int[] arr = { -2, 1, -3,2,-9, 4, -1,-8,1,5,-3, 2, 1, -5,-2, 4}; 
          max_sum();

          System.err.println("Max sum is " + maxSum(arr));
    }
}