import java.util.Scanner;
import java.util.Stack;

public class s3 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element: ");
            int a = sc.nextInt();
            st.push(a);
        }
        System.out.println(st);
    }
}