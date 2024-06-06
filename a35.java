public class a35{
    public static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }
    //merge the sorted linked list
    public static void merge(Node a,Node b){
        Node head1=a;
        Node head2=b;
        
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node x = new Node(1);
        Node y = new Node(2);
        Node z = new Node(3);
        Node w = new Node(4);
        Node v = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        x.next = y;
        y.next = z;
        z.next = w;
        w.next = v;
    }
}