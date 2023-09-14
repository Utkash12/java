public class ll69{
    public static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    // public static void display(Node head){
    //     Node temp=head;
    //     while(temp!=null){
    //         System.out.println(temp.data);
    //         temp=temp.next;
    //     }
    // }
    public  boolean loop(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
            else{
                return false;
            }
        }
        if(fast==null){
            return false;
        }
        return false;
    }
    public static void main(String[] args){
        Node a=new Node(5);
        Node b=new Node(10);
        Node c=new Node(15);
        Node d=new Node(20);
        Node e=new Node(35);
        Node f=new Node(40);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=c;
        Node head=a;
        // display(head);
    }
}