
class problem05 {
    public static void main(String[] args) {
        int n = 10;  // Number of terms 
        int first = 0, second = 1;
        System.out.print("Fibonacci Sequence: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

    }

}
