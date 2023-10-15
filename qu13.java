import java.util.*;
public class qu13{
    public static void main(String[] args){
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        System.out.println(q);
        Stack<Integer> st=new Stack<>();
        while(q.size()>=3){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        q.add(q.remove());
        q.add(q.remove());
        System.out.println(q);
    }
}