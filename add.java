import java.util.Scanner;
public class add{
    int addtion(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int x=sc.nextInt();
        System.out.println("Enter the second number: ");
        int y=sc.nextInt();
        add number=new add();
        // number.addtion(x,y);
        int c=number.addtion(x,y);
        System.out.println(c);
    }
}