import java.util.Scanner;
public class pattern2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length: ");
        int len=sc.nextInt();
        for(int i=0;i<len;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
