class fib{
    public static void main(String[] args){
        int a=0,b=1,next=0;
        for(int i=0;i<10;i++){
            System.out.print(a+" ");
            next=a+b;
            a=b;
            b=next;   
        }
    }
}