import java.util.Stack;

public class s17 {
    public static void balanced(String str){
        Stack<Character> st=new Stack<>();
        int n=str.length();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else if(ch==')'){
                if(st.size()==0 || st.peek()!='('){
                    System.out.println("Not balanced...");
                    return;
                }
                else{
                    st.pop();
                }
            }
            else if(ch=='}'){
                if(st.size()==0 || st.peek()!='{'){
                    System.out.println("Not balanced...");
                    return;
                }
                else{
                    st.pop();
                }
            }
            else if(ch==']'){
                if(st.size()==0|| st.peek()!='['){
                    System.out.println("Not balanced...");
                    return;
                }
                else{
                    st.pop();
                }
            }
        }
        if(st.size()==0){
            System.out.println("Balanced...");
        }
        else{
            System.out.println("Not balanced...");
        }
    }

    public static void main(String[] args) {
        String str = "(()){[]}{{}}()(";
        balanced(str);
    }
}