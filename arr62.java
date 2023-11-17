import java.util.Scanner;
public class arr62{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row length:");
        int r1=sc.nextInt();
        System.out.println("Enter column length: ");
        int c1=sc.nextInt();
        int[][] arr=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.println("Enter element "+i+" & "+j+":");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Before transpose: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println("");
        }
        System.out.println("After transpose: ");
        int[][] arr1=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j]=arr[j][i];
            }
        }
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(arr1[i][j]+"   ");
            }
            System.out.println("    ");
        }
    }
}