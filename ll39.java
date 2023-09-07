public class ll39{
    public static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    public void display(int val,Node head){
        Node temp=new Node(val);
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args){
        Node a=new Node(5);
        Node b=new Node(10);
        Node c=new Node(2);
        Node d=new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        Node temp=a;
        display(data,a);
    }
}