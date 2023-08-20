public class fib1 {
    // Recursive function to generate Fibonacci series up to 'n' terms
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10; // Change this value to generate a different number of terms
        
        System.out.println("Fibonacci series up to " + n + " terms:");
        
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
