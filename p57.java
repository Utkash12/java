//remove middle node from the linked list
public class p57 {
    public static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    public static void main(String[] args){
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        Node f=new Node(60);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=null;
        Node head=a;
        Node slow=head;
        Node fast=head;
        Node prev=null;
        
    }
}
