//create an array user input
import java.util.Scanner;
public class a1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            // int[] arr = new int[n];
            System.out.println("Enter the elements of the array");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
