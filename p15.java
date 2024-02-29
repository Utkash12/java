public class p15{
    public static  class Node {
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
            rev(head);
            System.out.println(head.next);
        }
    }

    public static void count(Node head) {
        int c = 0;
        while (head != null) {
            c++;
            head = head.next;
        }
        System.out.println("the number of nodes will be: " + c);
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
        count(head);
    }
}