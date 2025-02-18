

import java.util.Scanner;

public class roateArrayNtimes {
    @SuppressWarnings("ManualArrayToCollectionCopy")
    static void leftRotate(int arr[], int n, int d) {
        if (n == 0) return;
        d = d % n;
        if (d == 0) return;
        int[] temp = new int[d];
        for(int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        for (int i = n - d; i < n; i++) {
            arr[i] = temp[i - (n - d)];
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the size of the array");
        int n=sc.nextInt();
        System.err.println("Enter the data of the array");
       int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();    
        }
        System.err.println("Enter the number of times you want to rotate the array");
        int k=sc.nextInt();
        leftRotate(arr,n,k);
        for(int i=0;i<n;i++){
            System.out.printf("%d ",arr[i]);    
        }
    }
}
