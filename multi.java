import java.util.Scanner;
public class multi{
    static void func(int n,int i){
            System.out.println(i*n);
        }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
             func(i,num);
        }
    }
}