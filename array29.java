import java.util.Scanner;
public class array29{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows1=sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols1=sc.nextInt();
        int [][] arr1=new int[rows1][cols1];
        for(int i=0;i<rows1;i++){
            for(int j=0;j<cols1;j++){
                System.out.println("Enter the elements of the array: ");
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows1;i++){
            for(int j=0;j<cols1;j++){
               System.out.print(arr1[i][j]);
            }
            System.out.println("");
        }
        System.out.println("Enter the number of rows for matrix 2: ");
        int rows2=sc.nextInt();
        System.out.println("Enter the number of columns for matrix 2: ");
        int cols2=sc.nextInt();
        int [][] arr2=new int[rows2][cols2];
        for(int i=0;i<rows2;i++){
            for(int j=0;j<cols2;j++){
                System.out.println("Enter the elements of the array: ");
                arr2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows2;i++){
            for(int j=0;j<cols2;j++){
               System.out.print(arr2[i][j]);
            }
            System.out.println("");
        }
        int rows3;
        int cols3;
        if(rows1>rows2){
            rows3=rows1;
        }
        else{
            rows3=rows2;
        }
        if(cols1>cols2){
            cols3=cols1;
        }
        else{
            cols3=cols2;
        }
        int [][] arr3=new int[rows3][cols3];
        for(int i=0;i<rows3;i++){
            for(int j=0;j<cols3;j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for(int i=0;i<rows3;i++){
            for(int j=0;j<cols3;j++){
               System.out.print(arr3[i][j]);
            }
            System.out.println("");
        }
        

    }
}