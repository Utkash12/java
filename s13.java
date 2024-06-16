import java.util.Stack;
public class s13{
    public static void balance(String str) {
        int n = str.length();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else {
                if (st.peek() == ')') {
                    st.pop();
                } else if (st.size() == 0) {
                    System.out.println("Not balance..");
                    return;
                }
            }
        }
        if (st.size()!=0) {
            System.out.println("Not Balanced..");
        } else {
            System.out.println("Balanced..");
        }
    }

    public static void main(String[] args) {
        String str = "()(())";
        balance(str);

    }
}