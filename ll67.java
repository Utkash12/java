public class ll67{
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
    public static Node middle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void delete(Node head){
        Node slow=head;
        Node fast=head;
        while(fast.next.next.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
    }
    // public static int count(Node head){
    //     int c=0;
    //     Node temp=head;
    //     while(temp!=null){
    //         c++;
    //         temp=temp.next;
    //     }
    //     slow.next=slow.next.next;
    // }
    public static void main(String[] args){
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        Node head=a;
        display(head);
        System.out.println("The middle element is: "+middle(head).data);
        display(head);
    }

}