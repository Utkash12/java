//remove conseqitive subsequences using stack
import java.util.*;
public class s18 {
    public static void removeConsequtiveSubsequences(String str){
        Stack<Character> st=new Stack<>();
        int n=str.length();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(st.size()==0){
                st.push(ch);
            }
            else if(st.peek()==ch){
                while(i<n && st.peek()==ch){
                    i++;
                }
                i--;
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(st.size()!=0){
            sb.append(st.pop());
        }
        System.out.println(sb.reverse().toString());
    }
    public static void main(String[] args) {
        String str="abbaxyca";
        removeConsequtiveSubsequences(str);
    }
}