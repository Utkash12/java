public class ll10{
    public static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    public static void display(Node head,Node temp){
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
        Node d=new Node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        Node temp=a;
        display(a,temp);
    }
}