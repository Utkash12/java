import java.util.*;
public class qu7{
    public static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    public static class queuee{
        Node head=null;
        Node tail=null;
        int size=0;
        public void add(int val){
            Node temp=new Node(val);
            if(head==null){
                head=tail=temp;
                size++;
            }
            else{
                tail.next=temp;
                tail=temp;
                size++;
            }
        }
        public int remove(){
            if(head==null){
                System.out.println("Queue is empty");
                return -1;
            }
            else{
                int x=head.data;
                head=head.next;
                size--;
                return x;
            }
        }
        public int peek(){
            if(head==null){
                System.out.println("Queue is empty");
                return -1;
            }
            else{
                int x=head.data;
                return x;
            }
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args){
        queuee q=new queuee();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.display();
    }
}