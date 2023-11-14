//rotate array by k times
import java.util.*;
public class arr38{
    static int[] rotate(int[] arr,int k){
        int n=arr.length;
        int[] ans=new int[n];
        k=k%n;
        int j=0;
        for(int i=n-k;i<n;i++){
            arr[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            arr[j++]=arr[i];
        }
        return ans;
    }
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value of k");
        int k=sc.nextInt(); 
        System.out.println("Original array");
        printArray(arr);
        int[] ans=rotate(arr,k);
        System.out.println("Rotated array");
        printArray(ans);
    }
}