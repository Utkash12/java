import java.util.*;
public class s15{
    public static void balance(String str){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else if(ch==')'){
                if(st.size()==0 || st.peek()!='('){
                    System.out.println("Not Balanced");
                    return;
                }
                else{
                    st.pop();
                }
            }
            else if(ch=='}'){
                if(st.size()==0 || st.peek()!='{'){
                    System.out.println("Not Balanced");
                    return;
                }
                else{
                    st.pop();
                }
            }
            else if(ch==']'){
                if(st.size()==0 || st.peek()!='['){
                    System.out.println("Not Balanced");
                    return;
                }
                else{
                    st.pop();
                }
            }
        }
        if(st.size()==0){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not Balanced");
        }
    }
    public static void main(String[] args){
        String str="[{}(())]";
    }
}