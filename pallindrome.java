import java.util.Scanner;
public class pallindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int original;
        int rem;
        int check;
        rem=0;
        check=0;
        System.out.println("Enter the number to be checked: ");
        int num=sc.nextInt();
        original=num;
        while (num>0){
            rem=num%10;
            check=check*10+rem;
            num=num/10;
        }
        if(original==check){
            System.out.println("The number is a pallindrome number.");
        }
        else{
            System.out.println("The number is not a pallindrome number.");
        }
    }
}