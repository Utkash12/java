import java.util.Scanner;
public class array32{
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
       for(int i=0;i<n;i++){
        if(check==arr[i]){
            for(int j=i;j<n-1;j++){
                arr[j]=arr[j+1];
            }
        }
        for(int i1=0;i1<n-1;i1++){
            System.out.println(arr[i1]);
        }
       }
    }
}