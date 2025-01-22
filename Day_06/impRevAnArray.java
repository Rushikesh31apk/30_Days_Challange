package Recursion;

public class impRevAnArray {
  
    public static void rev(int i,int j,int arr[]){
        if(i>=j) return;
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        rev(i+1, j-1,arr);
    }
    public static void display(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.printf("%d ",a[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println("before fun calling: ");
        display(arr);
        rev(0,arr.length-1,arr);
        System.out.println("\nafter fun calling: ");
        display(arr);
        
    }
    
}
