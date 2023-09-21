import java.util.Stack;
public class st9{
    public static void reverse(Stack<Integer> st1){
        if(st1.size()==0){
            return;
        }
        int top=st1.pop();
        reverse(st1);
        insertAtBottom(st1,top);
    }
    public static void insertAtBottom(Stack<Integer> st1,int top){
        if(st1.size()==0){
            st1.push(top);
            return;
        }
        int val=st1.pop();
        insertAtBottom(st1,top);
        st1.push(val);
    }
    public static void main(String[] args){
        Stack<Integer> st1=new Stack<>();
        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(44);
        st1.push(40);
        System.out.println(st1);
        reverse(st1);
        System.out.println(st1);
    }
}