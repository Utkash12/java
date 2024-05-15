import java.util.Scanner;

public class a5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter th length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element:");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        System.out.println("The total sum will be: " + sum);
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("the maximum number will be: " + max);
        System.out.println("Enter the number to be checked: ");
        int ch = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == ch) {
                System.out.println("The element is found at index: " + i);
                break;
            } else {
                System.out.println("-1");
                break;
            }
        }
    }
}