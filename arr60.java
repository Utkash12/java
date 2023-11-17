import java.util.Scanner;
public class arr60{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Element r1: ");
        int r1=sc.nextInt();
        System.out.println("Element c1: ");
        int c1=sc.nextInt();
        System.out.println("Element r2: ");
        int r2=sc.nextInt();
        System.out.println("Element c2: ");
        int c2=sc.nextInt();
        if(c1!=r2){
            System.out.println("Invalid input.");
            return;
        }
        else{
            int[][] arr1=new int[r1][c1];
            int[][] arr2=new int[r2][c2];
            int[][] arr3=new int[r1][c2];
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    System.out.println("Element at "+i+" & "+j+":");
                    arr1[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<r2;i++){
                for(int j=0;j<c2;j++){
                    System.out.println("Element at "+i+" & "+j+":");
                    arr2[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    for(int k=0;k<c1;k++){
                        arr3[i][j]=arr3[i][j]+(arr1[i][k]*arr2[k][j]);
                    }
                }
            }
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    System.out.print(arr3[i][j]+"    ");
                }
                System.out.println("    ");
            }
        }
    }
}