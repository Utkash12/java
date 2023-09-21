import java.util.Stack;
public class st8{
    public static void reverse(Stack<Integer> st1){
        Stack<Integer> rt1=new Stack<>();
        while(st1.size()>0){
            rt1.push(st1.pop());
        }
        while(rt1.size()>0){
            st1.push(rt1.pop());
        }
    }
    public static void main(String[] args){
        Stack<Integer> st1=new Stack<>();
        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);
        System.out.println(st1);
    }
}