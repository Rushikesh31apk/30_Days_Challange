
import java.util.Scanner;

class transpose{
    public static void main(String[] args){
        int a[][]=new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.err.println("Enter "+(i+1)+"th row element: ");
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.err.println("Show array before transpose element: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.err.print(a[i][j]+" ");
            }
            System.err.println();
        }
        System.err.println("Show array after transpose element: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.err.print(a[j][i]+" ");
            }
            System.err.println();
        }

    }
}