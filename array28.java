import java.util.Scanner;
public class array28{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols=sc.nextInt();
        int [][] arr=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter the element: ");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the number of rows of another matrix: ");
        int rows1=sc.nextInt();
        System.out.println("Enter the number of columns of another matrix: ");
        int cols1=sc.nextInt();
        int [][] arr1=new int[rows1][cols1];
        for(int i1=0;i1<rows1;i1++){
            for(int j1=0;j1<cols1;j1++){
                System.out.println("Enter the element: ");
                arr1[i1][j1]=sc.nextInt();
            }
        }
        int [][] arr2=new int[rows1][cols1];
        for(int i2=0;i2<rows;i2++){
            for(int j2=0;j2<cols;j2++){
                arr[i2][j2]=arr[i2][j2]+arr1[i2][j2];
            }
        }
        for(int i2=0;i2<rows1;i2++){
            for(int j2=0;j2<cols1;j2++){
                System.out.print(arr[i2][j2]+"    ");
            }
            System.out.println();
        }
    }
}