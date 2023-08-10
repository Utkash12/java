public class stringtraverse{
    public static void main(String[] args) {
        String input = "Hello, world!";

        // Traverse the string using a for loop
        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            System.out.print(character + " ");
        }
    }
}
