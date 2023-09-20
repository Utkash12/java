import java.util.Scanner;
import java.util.Stack;
public class st7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st1=new Stack<>();
        System.out.println("Enter the number of elements in Stack: ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            System.out.println("Enter the number to be entered: ");
            int x=sc.nextInt();
            st1.push(x);
        }
        System.out.println("Stack before deletion: ");
        System.out.println(st1);
        System.out.println("Enter the index at which the number is to be deleted: ");
        int idx=sc.nextInt();
        Stack<Integer> rt1=new Stack<>();
        while(st1.size()>idx){
            rt1.push(st1.pop());
        }
        st1.pop();
        while(st1.size()>0){
            rt1.push(st1.pop());
        }
        while(rt1.size()>0){
            st1.push(rt1.pop());
        }
        System.out.println(st1);
    }
}