public class print1ton {
    
    public static void asending(int cnt,int n){
        if(cnt==n){
            return;
        }
        System.out.print(cnt+" ");
        asending(cnt+1,n); 
    }
    public static void main(String[] args) {
        asending(1,10);
        
    }
    
}
