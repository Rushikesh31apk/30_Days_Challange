

public class print1ton {
    
    public static void asending(int cnt,int n){
        if(cnt==n){
            return;
        }
        System.out.print(cnt);
        cnt=cnt+1;
        asending(cnt,n); 
    }
    public static void main(String[] args) {
        asending(1,10);
        
    }
    
}
