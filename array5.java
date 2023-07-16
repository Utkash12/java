import java.util.Scanner;
public class array5{
    public static void main(String[] args){
        System.out.println("Enter the number of rows");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns");
        int columns=sc.nextInt();
        int values;
        int arr[][]=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.println("Enter the value: ");
                values=sc.nextInt();
                values=arr[rows][columns];
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(arr[rows][columns]);
            }
            System.out.print("\n");
        }
        
    }
}