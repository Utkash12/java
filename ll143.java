import java.util.Stack;
public class ll143{
    public static void main(String[] args){
        Stack<String> st=new Stack<>();
        String str="953+4*6/-";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                st.push(ch+"");
            }
            else{
                String v2=st.pop();
                String v1=st.pop();
                char op=ch;
                String t="("+v1+op+v2+")";
                st.push(t);
            }
        }
        System.out.println(st.peek());
    }
}