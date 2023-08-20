public class fact1 {
    // Recursive function to calculate the factorial of a number
    static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5; // Change this value to calculate the factorial of a different number
        long result = factorial(number);
        System.out.println("The factorial of " + number + " is " + result);
    }
}
