import java.util.*;
public class qu14 {
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
        q.add(10);
        q.add(20);
        q.add(30);
        void push(int data){
            if(q.size()==0){
                q.add(data);
            }
            else{
                int s=q.size();
                q.add(data);
                while(s-- > 0){
                    q.add(q.remove());
                }
            }
        }
    }
    public static void main(String[] args){
        
        System.out.println(q);
    }
}
