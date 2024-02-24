public class p14{
    public static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public static void display(Node head) {
        if (head == null) {
            return;
        } else {
            System.out.println(head.data);
            display(head.next);
        }
    }

    public static void rev(Node head) {
        if (head == null) {
            return;
        } else {
            rev(head.next);
            System.out.println(head.data);
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
        display(head);
        rev(head);
    }
}