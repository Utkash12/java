import java.util.Scanner;
import java.util.Stack;
public class st5{
    public static void main(String[] args){
        Stack<Integer> st1=new Stack<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Enter the number to be inserted: ");
            int x=sc.nextInt();
            st1.push(x);
        }
        System.out.println("Stack before insertion: ");
        System.out.println(st1);
        Stack<Integer> rt1=new Stack<>();
        while(st1.size()>0){
            rt1.push(st1.pop());
        }
        System.out.println("after copying...");
        System.out.println(rt1);
        System.out.println("Enter the number to be inserted: ");
        int num=sc.nextInt();
        st1.push(num);
        while(rt1.size()>0){
            st1.push(rt1.pop());
        }
        System.out.println("Stack after insertion will be: ");
        System.out.println(st1);
    }
}