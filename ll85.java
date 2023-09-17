public class ll85{
    public static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        } 
        return prev;
    }
    public static void main(String[] args){
        Node a=new Node(2);
        Node b=new Node(4);
        Node c=new Node(6);
        Node d=new Node(8);
        Node e=new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        Node head=a;
        display(head);
        System.out.println("After reversing: ");
        // Node head1=reverse(head);
        // display(head1);
        display(reverse(head));

    }
}