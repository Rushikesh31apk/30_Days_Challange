import java.util.*;

class UnionofArr{
    public static void showUnion(int [] arr1, int[] arr2) {
        if(arr1.length<1 && arr2.length<1) {
            System.out.println("Both arrays are empty");
            return;
        }
        Set<Integer> set1 = new HashSet<>();
        for (int i : arr1) {
            set1.add(i);
        }
        for (int i : arr2) {
            set1.add(i);
        }
        for(int union:set1){
            System.out.print(union+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6};
        int[] arr2 = {1, 2, 3, 4, 5,8,3,9};
        showUnion(arr,arr2);
    }
}