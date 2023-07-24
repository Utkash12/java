import java.util.Scanner;
public class array26{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element at index "+i);
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println("The element at index "+i+" will be "+arr[i]);
        }
    }
}