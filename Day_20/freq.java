
import java.util.HashMap;

class freq{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1};
        HashMap<Integer,Integer> cnt= new HashMap();
        for(int i: arr){
            cnt.put(i, cnt.getOrDefault(i, 0)+1);
        }
        System.err.println("frequency of each num: "+ cnt);
    }

}