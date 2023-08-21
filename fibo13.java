import java.util.Scanner;
public class fibo13{
    static int func(int num){
        if(num==0 || num==1){
            return num;
        }
        else{
            return num-1 + func(num-2);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the last number: ");
        int last=sc.nextInt();
        for(int i=0;i<last;i++){
            System.out.println(func(i));
        }
        System.out.println("The last number is: "+func(last-1));
    }
}