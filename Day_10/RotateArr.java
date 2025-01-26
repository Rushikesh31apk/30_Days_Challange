class RotateArr{
    //rotate array
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k=k % n;
        //reverce whole arr
        reverse(arr, 0, n - 1);
        //reverse first k elements
        reverse(arr, 0, k- 1);
        //reverse last n-k elements
        reverse(arr, k, n - 1);
    }
    public static void reverse(int []arr, int i,int j) {
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6,7};
        int k = 2;
        rotate(arr, 2);
        System.err.print("Rotate arr by "+k+" is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}