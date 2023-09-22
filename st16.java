import java.util.Scanner;
public class st16{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the number to be entered: ");
            arr[i]=sc.nextInt();
        }
        System.out.println("The array will be: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}