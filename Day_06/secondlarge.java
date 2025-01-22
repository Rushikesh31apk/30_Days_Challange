package Recursion;

import java.util.ArrayList;
import java.util.List;

public class secondlarge {
    public static int sl(List<Integer> arr) {
        int large = arr.get(0);
        int slarge = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > large) {
                slarge = large;
                large = arr.get(i);
            } else if (arr.get(i) > slarge && arr.get(i) != large) {
                slarge = arr.get(i);
            }
        }
        return slarge;
    }

    public static int sm(List<Integer> arr) {
        int small = Integer.MAX_VALUE;
        int ssmall = Integer.MAX_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < small) {
                ssmall = small;
                small = arr.get(i);
            } else if (arr.get(i) < ssmall && arr.get(i) != small) {
                ssmall = arr.get(i);
            }
        }
        return ssmall;
    }

    public static List<Integer> slarge(List<Integer> arr) {
        int slarge = sl(arr);
        int ssmall = sm(arr);
        List<Integer> two = new ArrayList<>();
        two.add(slarge);
        two.add(ssmall);
        return two;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(2);
        arr.add(5);
        arr.add(1);
        arr.add(5);
        arr.add(7);
        List<Integer> two = new ArrayList<>();
        two = slarge(arr);
        for (int a : two) {
            System.out.println(a);
        }

    }

}
