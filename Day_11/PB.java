import java.util.Scanner;

class PB{
    public static String shortenName(String name) {
        String[] words = name.split("[-\s]");
        StringBuilder shortName = new StringBuilder();
        
        for (String word : words) {
            if (!word.isEmpty()) {
                shortName.append(Character.toLowerCase(word.charAt(0)));
            }
        }
        
        return shortName.toString();
    }
    //I am Android Dev

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine().trim();
        scanner.close();
        
        System.out.println(shortenName(name));
    }

   
}

