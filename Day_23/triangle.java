class triangle{
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i <n; i++) {
            for(int j=0;j<n-i;j++){
                System.err.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.err.print("*");
            }
            System.err.println();
        }
        for (int i = 1; i <n; i++) {
            for(int j=0;j<=i;j++){
                System.err.print(" ");
            }
            for(int j=0;j< 2*n-(2*i)-1;j++){
                System.err.print("*");
            }
            System.err.println();
        }

        int z=1;
        for (int i = 1; i <=n; i++) {
            z= i%2;
            for(int j=0;j<i;j++){
                System.err.print(z+" ");
                z=1-z;
            }
            System.err.println();
            
        }
    }
}