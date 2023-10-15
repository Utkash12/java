import java.util.Scanner;
import java.util.Stack;
public class ll152 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string..");
        String str=sc.nextLine();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{
                if(st.peek()=='('){
                    st.pop();
                }
                if(st.size()==0){
                    System.out.println("String is not balanced..");
                    return;
                }
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
