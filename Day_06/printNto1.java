package Recursion;
import java.util.Scanner;

public class printNto1 {
    public static void desending(int cnt ,int n){
        if(cnt==n){
            return;
        }
        System.out.println(n);
        n=n-1;
        desending(cnt, n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n th num: ");
        int n=sc.nextInt();
        System.out.println("basic recursion");
        desending(0, n);
    }
    
}
