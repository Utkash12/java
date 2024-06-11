import java.util.Stack;
public class s5 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        Stack<Integer> rt = new Stack<>();
        while (!st.isEmpty()) {
            rt.push(st.peek());
            st.pop();
        }
        while (!rt.isEmpty()) {
            System.out.println(rt.peek());
            rt.pop();
        }
    }
}
