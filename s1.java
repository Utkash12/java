import java.util.Stack;
public class s1{
    public static void main(String[] args){
        Stack<Integer> s=new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
        // System.out.println(s.peek());
        s.push(70);
        System.out.println("new");
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
        System.out.println(s.size());
    }
}