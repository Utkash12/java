import java.util.Scanner;
public class arr70{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows: ");
        int r=sc.nextInt();
        System.out.println("enter cols: ");
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        int total=0;
        int leftcol=0;
        int top=0;
        int bottom=r-1;
        int rightcol=c-1;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println("enter element: ");
                arr[i][j]=sc.nextInt();
            }
        }
        while(total<r*c){
            for(int i=leftcol;i<=rightcol && total<r*c;i++){
                System.out.print(arr[top][i]+" ");
                total++;
            }
            top++;
            for(int i=top;i<=bottom && total<r*c;i++){
                System.out.print(arr[i][rightcol]+" ");
                total++;
            }
            rightcol--;
            for(int i=rightcol;i>=leftcol && total<r*c;i--){
                System.out.print(arr[bottom][i]+" ");
                total++;
            }
            bottom--;
            for(int i=bottom;i>=top && total<r*c;i--){
                System.out.print(arr[i][leftcol]+" ");
                total++;
            }
            leftcol++;
        }

    }
}