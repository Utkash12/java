//spriral array
import java.util.Scanner;
public class arr69{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[4][4];
        int top=0;
        int bottom=3;
        int left=0;
        int right=3;
        int count=1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                arr[top][i]=count++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                arr[i][right]=count++;
            }
            right--;
            for(int i=right;i>=left;i--){
                arr[bottom][i]=count++;
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                arr[i][left]=count++;
            }
            left++;
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j]+" ");
            }
            // System.out.println(" ");
        }
    }
}