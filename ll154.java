import java.util.*;
public class ll154{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String...");
        String str=sc.nextLine();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(st.size()==0 && ch=='('){
                st.push(ch);
            }
            else if(st.size()>0 && st.peek()=='('){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        if(st.size()==0){
            System.out.println("String is balanced..");
        }
        else{
            System.out.println("String is not balanced..");
        }
    }
}