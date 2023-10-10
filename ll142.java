import java.util.Stack;
public class ll142{
    public static void main(String[] args){
        Stack<String> st=new Stack<>();
        String str="-9/*+5346";
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                st.push(ch+"");
            }
            else{
                String v1=st.pop();
                String v2=st.pop();
                char op=ch;
                st.push(v1+v2+op);
            }
        }
        System.out.println(st.peek());
    }
}