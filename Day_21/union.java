import java.util.HashSet;
import java.util.Set;

class union {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};
        Set<Integer> comman = new HashSet();
        for (int a : arr1) {comman.add(a);}
        for (int b : arr2) {comman.add(b);}
        System.err.print("Union number of both arrays: "+comman); 
    }
}