import java.util.Scanner;
public class arr58{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter r1: ");
        int r1=sc.nextInt();
        System.out.println("Enter c1: ");
        int c1=sc.nextInt();
        System.out.println("Enter r2: ");
        int r2=sc.nextInt();
        System.out.println("Enter c2: ");
        int c2=sc.nextInt();
        int[][] arr1=new int[r1][c1];
        int[][] arr2=new int[r2][c2];
        if(c1!=r2){
            System.out.println("Invalid input");
            return;
        }
        else{
            int[][] ans=new int[r1][c2];
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    arr1[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<r2;i++){
                for(int j=0;j<c2;j++){
                    arr2[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    for(int k=0;k<c1;k++){
                        ans[i][j]=ans[i][j]+arr1[i][k]*arr2[k][j];
                    }
                }
            }
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    System.out.print(ans[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}