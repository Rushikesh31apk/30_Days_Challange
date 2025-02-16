
import java.util.Arrays;

class dublicate{
    public static int findDub(int [] arr, int n) {
        if(n <= 1) return -1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    //second approch
    public static int findDub1(int [] arr, int n) {
        Arrays.sort(arr);
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                return arr[i];
            }
        }
        return -1;
    }
    
       
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,1,9,10};
        int n=arr.length;
        int dub =findDub1(arr,n);
        if(dub != -1){System.out.println("dublicate number is "+dub);}
        else{System.out.println("no dublicate number in array");}
        



    }
}