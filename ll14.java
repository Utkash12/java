public class ll14{
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
        Node c=new Node(15);
        Node d=new Node(20);
        a.next=b;
        b.next=c;
        c.next=d;
        System.out.println("The list will be: ");
        display(a);
        System.out.println("The reverse list will be: ");
        reverse(a);
    }
}