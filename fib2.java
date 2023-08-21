import java.util.Scanner;
public class fib2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the last limit: ");
        int last=sc.nextInt();
        int first=0;
        int second=1;
        System.out.println(first+" "+second);
        int c;
        for(int i=0;i<last;i++){
            c=first+second;
            System.out.println(c);
            first=second;
            second=c;
        }
    }
}