public class ll13{
    public static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    public static void reverse(Node head){
        if(head==null){
            return;
        }
        else{
            reverse(head.next);
            System.out.println(head.data);
        }
    }
    public static void main(String[] args){
        Node a=new Node(5);
        Node b=new Node(10);
        Node c=new Node(2);
        Node d=new Node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        reverse(a);
    }
}