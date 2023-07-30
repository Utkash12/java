import java.util.Scanner;
public class array31{
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
        System.out.println("Enter the number to be seen presence: ");
        int check=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==check){
                count++;
            }
        }
        System.out.println("The occurence will be: "+ count);
    }
}