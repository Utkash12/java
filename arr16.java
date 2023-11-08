import java.util.Scanner;
public class arr16{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println("Enter the element: ");
                arr[i][j]=sc.nextInt();
            }
        }
        int max=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("The max will be: "+max);
    }
}