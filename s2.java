import java.util.Stack;
public class s2 {
    public static void main(String[] args){
        Stack<Integer> s=new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        System.out.println(s.pop());
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
