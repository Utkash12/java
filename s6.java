import java.util.Stack;

public class s6{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        int idx = 3;
        Stack<Integer> rt = new Stack<>();
        while (st.size() >= 3) {
            rt.push(st.pop());
        }
        st.push(200);
        while (rt.size() > 0) {
            st.push(rt.pop());
        }
        while (st.size() > 0) {
            System.out.println(st.pop());
        }
    }
}