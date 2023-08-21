import java.util.Scanner;
public class sum2{
    static int func(int num){
        if(num==0){
            return 0;
        }
        return num+func(num-1);
       
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be added til: ");
        int num=sc.nextInt();
        System.out.println(func(num));
    }
}