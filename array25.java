import java.util.Scanner;
public class array25{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element to be entered: ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        int count=0;
        System.out.println("Enter the number to be cehcked: ");
        int check=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==check){
                count=count+1;
            }
        }
        System.out.println("The number "+check+" is present "+count+" times");
        for(int i=0;i<n;i++){
            if(check==arr[i]){
                for(int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                break;
            }
        }
        for(int i=0;i<n-1;i++){
            System.out.println(arr[i]);
        }
    }
}