public class ll3{
    public static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    public static void main(String[] args){
        Node a=new Node(5);
        Node b=new Node(7);
        Node c=new Node(9);
        Node d=new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=null;
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);
    }
}