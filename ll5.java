public class ll5{
    public static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            // this.next=null;
        }
    }
    public static void main(String[] args){
        Node a=new Node(5);
        Node b=new Node(10);
        Node c=new Node(2);
        Node d=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=null;
        Node temp=a;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}