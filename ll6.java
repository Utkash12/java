public class ll6{
    public static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
        
    }
    public static void display(Node temp,Node head){
        temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    public static void main(String[] args){
        Node a=new Node(5);
        Node b=new Node(10);
        Node c=new Node(2);
        Node d=new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        Node temp=a;
        // d.next=null;
        display(temp,a);
        // System.out.println(a.next.next.data);
    }
}