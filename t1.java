public class t1 {
    public static void main(String[] args) {
        try {
            int a = 20;
            int b = 4;
            int c = a / b;
            System.out.println("c: " + c);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally block");
        }
    }
}