public class ll9{
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
        Node a=new Node(10);
        Node b=new Node(4);
        Node c=new Node(9);
        Node d=new Node(2);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=null;
        Node temp=a;
        display(a,temp);
    }
}