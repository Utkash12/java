import java.util.Scanner;
public class array22{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number you want to remove from the array: ");
        int a= sc.nextInt();
        int [] arr={1,2,3,4,2,3,2,34,2};
        int [] arr2=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=a){
                arr2[i]=arr[i];
            }
        }
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}