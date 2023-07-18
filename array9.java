import java.util.Scanner;
public class array9{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the number for the array: ");
            arr[i]= sc.nextInt();
        }
        System.out.println("The array is as follows: ");
        for(int i=0;i<arr.length;i++){
            System.out.println("The number at position "+i+" will be "+arr[i]);
        }
    }
}