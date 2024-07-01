public class t6 {
    public static void validate(int age){
        if(age < 18)
            throw new ArithmeticException("Not valid");
        else
            System.out.println("Welcome to vote");
    }
    public static void main(String[] args){
        validate(12);
        System.out.println("Rest of the code...");
    }
}
