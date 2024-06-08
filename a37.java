public class a37{
    public static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    public static void merge(Node head1, Node head2){
        Node temp=new Node(0);
        Node t1=temp;
        Node temp1=head1;
        Node temp2=head2;
        while(temp1!=null && temp2!=null){
            if(temp1.data<temp2.data){
                t1.next=temp1;
                temp1=temp1.next;
            }
            else{
                t1.next=temp2;
                temp2=temp2.next;
            }
            t1=t1.next;
        }
        if(temp1!=null){
            t1.next=temp1;
        }
        if(temp2!=null){
            t1.next=temp2;
        }
    }
    public static void main(String[] args){
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        Node f=new Node(60);
        Node x=new Node(4);
        Node y=new Node(5);
        Node z=new Node(6);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=null;
        x.next=y;
        y.next=z;
        z.next=null;
        merge(a,x);
        Node t=a;
        while(t!=null){
            System.out.println(t.data);
            t=t.next;
        }
    }
}