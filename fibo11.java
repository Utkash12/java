import java.util.Scanner;
public class fibo11{
    static int func(int num){
        if(num==1 || num==0){
            return num-1;
        }
        // else{
        //     return func(num-1)+func(num-2);
        // }
        else{
            return func(num-1)+ func(num-2);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the last number for series: ");
        int last=sc.nextInt();
        int lastone=last-1;
        System.out.println(func(lastone));
    }
}