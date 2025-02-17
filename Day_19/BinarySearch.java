class BinarySearch{
    public static boolean isFound(int[] arr, int target){
        int low=0,high=arr.length-1,mid=0;
        while(low<=high){
            mid = low + (high-low)/2;
            if(arr[mid]==target){return true;}
            if(arr[mid]< target){low = mid+1;}
            else{ high = mid-1;}
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,11,23,33,36,42,56,78,80,92};
        int target=560;
        if(isFound(arr, target)){
            System.out.println("using binary search number: "+ target +" is found in Array");
        }else{
            System.out.println("Element not Found!");
        }

    }
}