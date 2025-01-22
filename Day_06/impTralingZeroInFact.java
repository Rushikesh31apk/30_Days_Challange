package Recursion;

import java.util.Scanner;
//factorial how many num in case 0
public class impTralingZeroInFact {
    public static int checkTrailling(int n){
        int rev=0;
        for(int i=5;i<=n;i=i*5){
            rev+=n/i;
        }
        return rev;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num : ");
        int n=sc.nextInt();
        int zero=checkTrailling(n);
        System.out.println("Traling zeros in "+n+"th factorial: "+zero);
    }
    
}
