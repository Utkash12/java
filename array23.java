import java.util.Scanner;
public class array23{
    public static void main(String[] args){
        System.out.println("enter the element to be deleted: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr={1,2,3,4,2,4,2,3,42,2};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                count=count+1;
            }
        }
        System.out.println("the number of"+n+"in the array are"+ count);
        int[] arr2=new int[arr.length-count];
        for(int i=0;i<arr2.length;i++){
            System.out.println("Enter the element: ");
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}