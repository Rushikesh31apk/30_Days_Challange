import java.util.Arrays;

 class RotateArray { 
    public static void main(String[] args) { 
        int[] arr = {1, 2, 3, 4, 5}; 
        int k=6;
        k= k %arr.length; 
        reverse(arr, 0, arr.length - 1); 
        reverse(arr, 0, k - 1); 
        reverse(arr, k, arr.length - 1); 
        System.out.println(Arrays.toString(arr)); 
    } 
 
    public static void reverse(int[] arr, int start, int end) { 
        while (start < end) { 
            int temp = arr[start]; 
            arr[start] = arr[end]; 
            arr[end] = temp; 
            start++; 
            end--; 
        } 
    } 
} 