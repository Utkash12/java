public class ll2{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            // this.next=Null;
        }
    }
    public static void main(String[] args){
        Node a=new Node(4);
        Node b=new Node(6);
        Node c=new Node(1);
        a.next=b;
        b.next=c;
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        System.out.println(a);
    }
}