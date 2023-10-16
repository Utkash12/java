import java.util.*;
public class ll155{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String...");
        Stack<Character> st=new Stack<>();
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{
                if(st.size()>0 && st.peek()=='(' ){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
        }
        if(st.size()>0){
            System.out.println("String is unbalanced...");
        }
        else{
            System.out.println("String is balanced...");
        }
    }
}