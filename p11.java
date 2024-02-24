public class p11 {
    public static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public static void display(Node n) {
        if (n == null) {
            return;
        } else {
           while(n.next!=null){
               System.out.println(n.data);
               n=n.next;
           }
        }
    }

    public static void rev(Node n) {
        if (n == null) {
            return;
        } else {
            rev(n.next);
            System.out.println(n.data);
        }
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        Node head = a;
        display(a);
        rev(a);
    }
}