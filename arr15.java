import java.util.Scanner;
public class arr15{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element: ");
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println("The total sum will be: "+sum);
    }
}