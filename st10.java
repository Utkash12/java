import java.util.Stack;
public class st10{
    public static void reverse(Stack<Integer> st1){
        if(st1.size()==1){
            return;
        }
        else{
            int top=st1.pop();
            reverse(st1);
            pushAtBottom(st1,top);
            
        }
    }
    public static void pushAtBottom(Stack<Integer> st1,int x){
        if(st1.size()==0){
            st1.push(x);
        }
        else{
            int top=st1.pop();
            pushAtBottom(st1,x);
            st1.push(top);
        }
    }
    public static void main(String[] args){
        Stack<Integer> st1=new Stack<>();
        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);
        System.out.println(st1);
        System.out.println(st1.reverse());
        // array
        // int[] arr=new int[n];
    }
}