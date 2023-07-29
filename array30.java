import java.util.Scanner;
public class array30{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the elements of the array: ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println("The element at index "+i+" will be "+arr[i]);
        }
        System.out.println("Enter the number to be checked: ");
        int check=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==check){
                for(int j=i;j<n-1;j++){
                    arr[j]=arr[j+1];
                }
            }
        }
        for(int i=0;i<n-1;i++){
            System.out.println(arr[i]);
        }
        
    }
}