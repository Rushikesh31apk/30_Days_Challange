import java.util.HashSet;
import java.util.Set;

class intersec {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};
        Set<Integer> comman = new HashSet();
        for (int a : arr1) {comman.add(a);}
        System.err.print("Similar number of both arrays: ");
        for (int b : arr2) {
            if (comman.contains(b)) {
                System.err.print(b+" ");
            }
        }
    }
}
