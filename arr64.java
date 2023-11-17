import java.util.Scanner;
public class arr64{
    public static void main(String[] args){
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<3;i++){
            for(int j=i;j<3;j++){
                // arr[i][j]=arr[i][j]+arr[j][i];  //5+10=15
                // arr[j][i]=arr[i][j]-arr[j][i];  //15-10=5
                // arr[i][j]=arr[i][j]-arr[j][i];       //15-
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+"    ");
            }
            System.out.println("    ");
        }
    }
}