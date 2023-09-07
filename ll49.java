public class ll49{
    public static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    public static Node nthnode(Node head,int idx){
        Node fast=head;
        Node slow=head;
        for(int i=1;i<=idx;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
    public static void display(Node temp,Node head){
        temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
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
        Node q=nthnode(a,3);
        System.out.println(q.data);
        Node k=a;
        display(k,a);
    }
}