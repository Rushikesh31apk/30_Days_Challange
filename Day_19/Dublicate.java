
import java.util.HashSet;
import java.util.Set;

class Dublicate{
    //approch one
    public static int isdub(int[] nums){
        if(nums.length == 0) {
            System.err.println("Array is Empty!");
            return -1;
        }
        Set<Integer> sol =new HashSet();
        for(int i: nums){
            if(!sol.add(i)){return i;}
        }
        return -1;
    }
    //approch two 
    public static int isdub1(int[] nums){
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i] == nums[j] ){return nums[i];}
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,2,5};
        int res=isdub(nums);
        if( res != -1){
            System.err.println("Dublicate num is: "+res);
        }
    }
}