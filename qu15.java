import java.util.*;

public class qu15 {
    public static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    public static class Stack{
        Node head=null;
        int size=0;
        Queue<Integer> q=new LinkedList<>();
        void push(int data){
            if(q.size()==0){
                q.add(data);
                size++;
            }
            else{
                q.add(data);
                for(int i=0;i<q.size()-1;i++){
                    q.add(q.remove());
                    size++;
                }
            }
        }
        int pop(){
            if(q.size()==0){
                System.out.println("Stack underflow..");
                return -1;
            }
            else{
                return q.remove();
            }
        }
        int size(){
            return q.size();
        }
        void display(){
            System.out.println(q);
        }
        public int top(){
            if(q.size()==0){
                System.out.println("Stack underflow..");
                return -1;
            }
            else{
                return q.peek();
            }
        }
    }
    public static void main(String[] args){
        
        // Queue<Integer> q=new LinkedList<>();
        // q.add(10);
        // q.add(20);
        // q.add(30);
        // System.out.println(q);
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.display();
        System.out.println(st.top());
        System.out.println(st.pop());
        System.out.println(st.size());
        
        st.display();


    }
}
