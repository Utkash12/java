public class a22 {
    public static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
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
    public static void count(Node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        System.out.println("Number of nodes in the linked list are: "+count);
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(40);
        Node d = new Node(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        display(a);
        count(a);
    }
}
