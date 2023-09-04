public class ll12{
    public static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    public static void display(Node head){
        if(head==null){
            return;
        }
        else{
            System.out.println(head.data);
            display(head.next);
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
        display(a);
        System.out.println(a.data);
        System.out.println(a.next.data);
    }
}