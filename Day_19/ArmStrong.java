
class ArmStrong {

    public static void main(String[] args) {
        int num = 153;
        int n = String.valueOf(num).length();

        int temp = num;
        int sum = 0;
        while (temp != 0) {
            sum += Math.pow(temp % 10, n);
            temp /= 10;
        }
        if (sum == num) {
            System.err.println("Given Num is ArmStrong");
        }
        char ch = (char) num; // Explicit typecasting  
        System.out.println(ch); // Output: A    
        String str = String.valueOf(num); // Using String.valueOf()  
// OR  
        String str2 = Integer.toString(num); // Using Integer.toString()  
        System.out.println(str); // Output: 123  

        num = Integer.parseInt(str); // Using Integer.parseInt()  
        System.out.println(num); // Output: 456  

    }
}
