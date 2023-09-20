import java.util.Scanner;
import java.util.Stack;
public class st4{
    public static void main(String[] args){
        Stack<Integer> st1=new Stack<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the stack: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Enter the element to be printed: ");
            int x=sc.nextInt();
            st1.push(x);
        }
        System.out.println(st1);
        System.out.println("enter the index: ");
        int idx=sc.nextInt();
        System.out.println("Enter the number to be inserted: ");
        int num=sc.nextInt();
        Stack<Integer> naye=new Stack<>();
        while(st1.size()>idx){
            naye.push(st1.pop());
        }
        naye.push(num);
        
    }
}