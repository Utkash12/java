import java.util.*;
public class ll158{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String...");
        String str=sc.nextLine();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else if(ch==')'){
                if(st.peek()=='('){
                    st.pop();
                }
                else{
                    System.out.println("false");
                    return;
                }
            }
            else if( ch=='}'){
                if( st.peek()=='{'){
                    st.pop();
                }
                else{
                    System.out.println("false");
                    return;
                }
            }
            else if(ch==']'){
                if(st.peek()=='['){
                    st.pop();
                }
                else{
                    System.out.println("false");
                    return;
                }
            }
            else{
                continue;
            }
        }
        if(st.size()==0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}