public class character {
    public static void main(String[] args) {
        String input = "Hello, world!";
        
        // Convert the string to a character array
        char[] charact = input.toCharArray();
        
        // Print each character in the character array
        for (char c : charact) {
            System.out.print(c + " ");
        }
    }
}
