import java.util.*;
public class ll159 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else{
                if(ch==')'){
                    if(st.peek()=='('){
                        System.out.println("true");
                        return;
                    }
                    else{
                        while(st.peek()!='('){
                            st.pop();
                        }
                        st.pop();
                    }
                }
                else if(ch=='}'){
                    if(st.peek()=='{'){
                        System.out.println("true");
                        return;
                    }
                    else{
                        while(st.peek()!='{'){
                            st.pop();
                        }
                        st.pop();
                    }
                }
                else if(ch==']'){
                    if(st.peek()=='['){
                        System.out.println("true");
                        return;
                    }
                    else{
                        while(st.peek()!='['){
                            st.pop();
                        }
                        st.pop();
                    }
                }
                else{
                    continue;
                }
            }
        }
        System.out.println("false");
        
    }
}
