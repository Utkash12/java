// longest consequetive subsequence  
import java.util.Scanner;
public class str101{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element: ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int check=arr[i];
                int count=0;
                if(arr[j]==check+1){
                    count++;
                    check=arr[j];
                }
                else{
                    break;
                }
                System.out.println(count);
            }
        }
    }
}