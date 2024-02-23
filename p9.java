public class p9 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void display(Node n){
        if(n==null){
            return;
        }
        else{
            while (n.next != null) {
                System.out.println(n.data);
                n = n.next;
            }
        }
    }
    public static void main(String[] args){
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;
        Node head=a;
        // while(head!=null){
        //     System.out.println(head.data);
        //     head=head.next;
        // }
        display(a);
    }
}
