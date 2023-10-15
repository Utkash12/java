import java.util.*;
public class qu10{
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println(q);
        Stack<Integer> st=new Stack<>();
        while(q!=null){
            st.push(q.remove());
        }
    }
}