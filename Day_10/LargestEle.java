class LargestEle{
    //find largest element in array
    public static int findLargest(int[] arr) {
        int max = arr[0];
        for(int a : arr) {
            if (a > max) {
                max = a;
            }
        }
        return max;
    }
    // find second largest
    public static int findSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int a : arr) {
            if (a > max) {
                secondMax = max;
                max = a;
            }else if(a>secondMax && a!=max) {
                secondMax = a;
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4,2, 3, 4,4,5, 5};
        int max = findLargest(arr);
        System.out.println("Largest element is " + max);
        int secondMax = findSecondLargest(arr);
        System.out.println("Second largest element is " + secondMax);
        }
}