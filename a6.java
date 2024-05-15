import java.util.Scanner;

public class a6{
    public static void main(String[] args) {
        System.out.println("ENter the number of elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number: ");
            arr[i] = sc.nextInt();
        }
    }
}