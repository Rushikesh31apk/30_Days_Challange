class LinearSearch{
    public static int linearSearch(int arr[],int k){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                return arr[i];
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50,90};
        int target = 31;
        int result = linearSearch(arr, target);
        if(result == -1) {
            System.out.println("Element is not present in array");
        }
        else {
            System.out.println("Element is present at index " + result);
        }
    }
}