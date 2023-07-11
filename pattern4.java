import java.util.Scanner;
public class pattern4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length: ");
        int len=sc.nextInt();
        for(int i=0;i<len;i++){
            for(int j=len;j>i;j--){
                System.out.print("* ");
            }
            for(int k=0;k<i;k++){
                System.out.print("  ");
            }
            
            
            for(int a=0;a<i;a++){
                System.out.print("  ");
            }
            for(int b=len;b>i;b--){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}