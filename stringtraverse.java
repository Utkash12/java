public class stringtraverse{
    public static void main(String[] args) {
        String input = "Hello, world!";
        char ch='l';
        // Traverse the string using a for loop
        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            System.out.print(character + " ");
        }
        for(int i=0;i<input.length();i++){
            System.out.print(input.charAt(i));
        }

        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==ch){
                input.replace(ch, 'a');
            }
        }
        
    }
}
