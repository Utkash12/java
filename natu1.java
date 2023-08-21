import java.util.Scanner;
public class natu1{
    static int func(int num){
       if(num==1 || num==0){
            return num;
       }
       else{
           return num+func(num-1);
       }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the last number: ");
        int last=sc.nextInt();
        System.out.println(func(last));
    }
}