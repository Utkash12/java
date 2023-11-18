import java.util.Scanner;
public class arr71{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows: ");
        int r=sc.nextInt();
        System.out.println("Enter columns: ");
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println("Enter element: ");
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+"    ");
            }
            System.out.println("    ");
        }
        for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i]=temp;
            }
        }
        System.out.println("Transpose: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + "    ");
            }
            System.out.println("    ");
        }
        // //rotate by 90 degrees
        // for(int i=0;i<r;i++){
        //     int low=0;
        //     int high=c-1;
        //     while(low<high){
        //         int temp=arr[i][low];
        //         arr[i][low]=arr[i][high];
        //         arr[i][high]=temp;
        //         low++;
        //         high--;
        //     }
        // }
        //3 2 1
        //6 5 4
        //9 8 7
        for(int i=0;i<r;i++){
            for(int j=0;j<c/2;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[i][c-1-j];
                arr[i][c-1-j]=temp;
            }
        }
        System.out.println("Transpose: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + "    ");
            }
            System.out.println(" ");
        }
    }
}