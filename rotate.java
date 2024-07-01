//rotate a matrix by 90 degree
import java.util.Scanner;
public class rotate{
    public static void rotating(int[][] arr){
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            for(int j=i;j<n-i-1;j++){
                int temper=arr[i][j];
                arr[i][j]=arr[j][n-i-1];
                arr[j][n-i-1]=arr[n-i-1][n-j-1];
                arr[n-i-1][n-j-1]=arr[n-j-1][i];
                arr[n-j-1][i]=temper;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the N of the array: ");
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Initial array:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Rotated array:");
        rotating(arr);

    }
}