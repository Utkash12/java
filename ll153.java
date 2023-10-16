import java.util.*;
public class ll153{
    public static boolean isBalanced(String str){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{
                if(st.size()>0 && st.peek()=='('){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(st.size()>0){
            return false;
        }
        else{
            return true; 
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string..");
        String str=sc.nextLine();
        System.out.println(isBalanced(str));

    }
}