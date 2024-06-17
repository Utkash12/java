import java.util.Stack;

public class s19 {
    public static void conse(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (st.size() == 0) {
                st.push(ch);
            }if (st.peek() == ch) {
                while (st.peek() == ch) {
                    i++;
                }
                st.pop();
            } else {
                st.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (st.size() != 0) {
            sb.append(st.pop());
        }
    }

    public static void main(String[] args) {
        String str = "12344555667889000";
        conse(str);
    }
}