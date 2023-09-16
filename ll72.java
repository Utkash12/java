public class ll72{
    public static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    public static Node nthnode(Node head){
        Node fast=head;
        Node slow=head;
        while(fast!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                break;
            }
            else{
                return null;
            }
        }
        Node temp=head;
        while(temp!=slow){
            temp=temp.next;
            slow=slow.next;
        }
        return slow;
    }
    public static void main(String[] args){
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        Node h=new Node(8);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        h.next=c;
        Node head=a;
        System.out.println("Loop starts at: "+nthnode(head).data);
    }
}