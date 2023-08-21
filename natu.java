import java.util.Scanner;
public class natu{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the last number: ");
        int last=sc.nextInt();
        int sum=0;
        for(int i=0;i<=last;i++){
            sum=sum+i;
        }
        System.out.println("The sum will be: "+sum);
    }
}