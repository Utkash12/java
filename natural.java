import java.util.Scanner;
public class natural{
    static int func(int num){
        if(num==0){
            return 0;
        }
        else{
            return func(num) + func(num-1);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the last number");
        int last=sc.nextInt();
        System.out.println(func(last));
    }
}