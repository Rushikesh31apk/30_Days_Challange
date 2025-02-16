class MoveZero{
    public static void moveZero(int[] nums) {
        int count = 0;
        for(int num :nums){
            if(num != 0) {nums[count++]=num;}
        }
        while(count < nums.length) { nums[count++]=0;}
    }
    public static void main(String[] args) {
        int num[]= {0,1,0,3,12};
        moveZero(num);
        for(int i : num) {
            System.out.print(i + " ");
        }
    }
}