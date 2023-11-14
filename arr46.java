import java.util.*;
public class arr46{
    public static void main(String[] args){
        int[] arr=new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the element: ");
            int num=sc.nextInt();
            arr[num]=1;
        }
        for(int i=0;i<100;i++){
            if(arr[i]==1){
                System.out.print(i+" ");
            }
            else{
                System.out.println("Not in the array");
            }
        }
    }
}