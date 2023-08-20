import java.util.Scanner;
public class fib{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements in the list for fibonnaci series: ");
        int last=sc.nextInt();
        int first=0;
        int second=1;
        int c;
        System.out.println(first+" "+second);
        for(int i=0;i<last;i++){
            c=first+second;
            System.out.println(c);
            first=second;
            second=c;
        }
    }
}