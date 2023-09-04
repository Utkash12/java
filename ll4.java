public class ll4{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            // this.next=null;
        }
    }
    public static void main(String[] args){
        Node a=new Node(2);
        Node b=new Node(4);
        Node c=new Node(6);
        Node d=new Node(8);
        Node e=new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;
        Node temp=a;
        for(int i=0;i<=4;i++){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}