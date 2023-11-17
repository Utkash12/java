import java.util.Scanner;
public class arr56{
    public static void main(String[] args){
        int[][] arr1=new int[3][3];
        int[][] arr2=new int[2][2];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("Element at "+i+" & "+j);
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println("Element at "+i+" & "+j);
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr1[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println("    ");
        }
    }
}