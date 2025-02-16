
import java.util.Arrays;


class InterSection {

    public static int[] intersection(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int n = arr1.length + arr2.length;
        int[] result = new int[n];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                result[k++] = arr1[i];
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5,};
        int[] arr2 = {4, 5, 6, 7, 8};
        int[] result = intersection(arr1, arr2);
        System.out.println(Arrays.toString(result));
        System.err.println(result.length);

    }
}
