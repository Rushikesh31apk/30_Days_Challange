class problem04{
    public static void main(String[] args) {
        int num=28;
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
                System.out.print(sum+" ");
            }
        }
        System.out.println();
        if(sum ==num){
            System.out.println(num+" is a perfect number");
        }
        else{
            System.out.println(num+" is not a perfect number");
        }
    }
}