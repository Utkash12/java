import java.util.Scanner;
import java.util.Stack;
public class st6 {
    public static void displayReverseRec(Stack<Integer> st1){
        if(st1.size()==0){
            return;
        }
        int top=st1.pop();
        System.out.println(top+" ");
        displayReverseRec(st1);
        st1.push(top);
    }
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
        displayReverseRec(st1);
        // System.out.println("Stack after insertion: ");
        // System.out.println(st1);
    }
}
