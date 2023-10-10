import java.util.Stack;
public class ll141{
    public static void main(String[] args){
        Stack<String> val=new Stack<>();
        Stack<Character> op=new Stack<>();
        String infix="9-(5+3)*4/6";
        for(int i=0;i<infix.length();i++){
            char ch=infix.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                val.push(ch+"");
            }
            else if(op.size()==0 || ch=='('|| op.peek()=='('){
                op.push(ch);
            }
            else if(ch==')'){
                while(op.peek()!='('){
                    String v2=val.pop();
                    String v1=val.pop();
                    char c=op.peek();
                    String t=c+v1+v2;
                    val.push(t);
                }
                op.pop();
            }
            if(ch=='*'|| ch=='/'){
                if(op.peek()=='*'|| op.peek()=='/'){
                    String v2=val.pop();
                    String v1=val.pop();
                    char chh=op.pop();
                    String t=chh+v1+v2;
                    val.push(t);
                    op.push(chh);
                }
                else if(op.peek()=='+' || op.peek()=='-'){
                    op.push(ch);
                }
            }
        }
        while(val.size()>1){
            String v2=val.pop();
            String v1=val.pop();
            char ch=op.pop();
            String t=ch+v1+v2;
            val.push(t);
        }
        System.out.println(val.peek());
    }
}