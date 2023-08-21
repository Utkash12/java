import java.util.Scanner;
public class sum1{
    static void func(int num,int sum){
        sum=0;
        for(int i=0;i<=num;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be added til: ");
        int num=sc.nextInt();
        int sum=0;
        func(num,sum);
    }
}