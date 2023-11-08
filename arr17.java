import java.util.Scanner;
public class arr17{
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
       System.out.println("Enter the number to be searched: ");
       int num=sc.nextInt();
       int flag=0;
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
                if(arr[i][j]==num){
                    System.out.println("The number is present");
                    flag=1;
                    break;
                }
                else{
                    flag=0;
                }
           }
       }
         if(flag==0){
              System.out.println("The number is not present");
         }
         else{
                System.out.println("The number is present at: "i+" "+j);
         }
    }
}