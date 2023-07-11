import java.util.Scanner;
public class reverse{
    public static void main(String[] args){
        int rem=0;
        int rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be reversed: ");
        int num=sc.nextInt();
        while (num>0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("The reversed number will be: "+rev);
    }
}