
import java.util.*;
public class sumOfN {
    public static void sum(int i, int sum){
        if(i<1){
            System.out.println("sum of first n num:"+sum);
            return;
        }
        sum(i-1,sum+i);
    }
    public static void main(String[] args) {
        System.out.println("enter num ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sum(n,0);

    }
    
}
