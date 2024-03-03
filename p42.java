public class p42 {
    public class nthNodeFromEnd{
        public static Node nthNode(Node head,int n){
            int size=0;
            Node temp=head;
            while(temp!=null){
                size++;
                temp=temp.next;
            }
            int m=size-n+1;
            temp=head;
            for(int i=1;i<m;i++){
                temp=temp.next;
            }
            return temp;
        }
        public static Node nthNode2(Node head,int n){
            Node slow=head;
            Node fast=head;
            for(int i=1;i<=n;i++){
                fast=fast.next;
            }
            while(fast!=null){
                slow=slow.next;
                fast=fast.next;
            }
            return slow;
        }
    }
    
    public static class Node {
        Node next;
        int data;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }
    public static void main(String[] args){
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        Node q=nthNode2(a,2);
        System.out.println(q.data);

    }
}
