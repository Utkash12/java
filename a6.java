import java.util.Scanner;

public class a6{
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        System.out.println("ENter the number of elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number: ");
            arr[i] = sc.nextInt();
        }
        display(arr);
        int[] arr2=new int[n];
        arr2=arr;
        System.out.println("The copied array is: ");
        display(arr2);
    }
}