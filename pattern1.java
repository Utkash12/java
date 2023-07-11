import java.util.Scanner;
public class pattern1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the pattern: ");
        int len=sc.nextInt();
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}