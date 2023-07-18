import java.util.Scanner;
public  class array13{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int x: arr){
            System.out.println("Enter the element to be printed: ");
            arr[x]=sc.nextInt();
            x++;
        }
        System.out.println("The array will be: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}