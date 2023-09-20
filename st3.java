import java.util.Scanner;
import java.util.Stack;
public class st3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st1=new Stack<>();
        System.out.println("Enter the numberof elements: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Enter the element to be inserterd: ");
            int x=sc.nextInt();
            st1.push(x);
        }
        System.out.println(st1);
        Stack<Integer> rt1=new Stack<>();
        while(st1.size()>0){
            rt1.push(st1.pop());
        }
        System.out.println("The reversed stack will be: ");
        System.out.println(rt1);
        System.out.println(st1.isEmpty());
        Stack<Integer> st2=new Stack<>();
        while(rt1.size()>0){
            st2.push(rt1.pop());
        }
        System.out.println("The copied stack will be: ");
        System.out.println(st2);
    }
}