import java.util.Scanner;
public class fibo{
    static int fib(int num){
        if (num == 1 || num == 0) {
            return num - 1;
        }
        else{
            return fib(num-1)+ fib(num-2);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the last limit: ");
        int last=sc.nextInt();
        int lastone=last-1;
        System.out.println(fib(lastone));
    }
}