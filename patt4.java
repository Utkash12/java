import java.util.Scanner;
public class patt4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int range=sc.nextInt();
        for(int i=0;i<range;i++){
            for(int j=range;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}