public class ll65{
    public static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    public static void len1(Node head){
        Node temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        System.out.println("the first count total will be: "+c);
    }
    public static void len2(Node head){
        Node temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        System.out.println("The second counr total will be: "+c);
    }
    public static int diff(int len1,int len2){
        int d=0;
        if(len1>len2){
            d=len1-len2;
        }
        else{
            d=len2-len1;
        }
        return d;
    }
    public static void main(String[] args){
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(6);
        Node f=new Node(7);
        Node g=new Node(8);
        Node h=new Node(9);
        Node z=new Node(10);
        Node y=new Node(11);
        Node x=new Node(12);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        x.next=y;
        y.next=z;
        z.next=f;
        Node head1=a;
        Node head2=x;
        len1(head1);
        len2(head2);
        System.out.println("The difference between the two linked list will be: "+diff(8,3));
    }
}