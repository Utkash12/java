import java.util.*;
public class ll164{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string..");
        String str=sc.nextLine();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(st.size()==0 || st.peek()!=ch){
                st.push(ch);
            }
            else if(st.size()>0 && st.peek()==ch){
                while(st.peek()==ch){
                    ch=st.pop();
                    
                }
            }
        }
        System.out.println(st);
    }
}