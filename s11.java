import java.util.Stack;
public class s11 {
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        //displaying the stack
        while(st.size()>0){
            System.out.println(st.pop());
        }
    }
}
