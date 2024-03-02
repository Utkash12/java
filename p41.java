public class p41 {
    public static class Node {
        Node next;
        int data;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;

        void insert(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        void display(Node head) {
            if (head == null) {
                return;
            } else {
                System.out.println(head.data);
                display(head.next);
            }
        }

        void rev(Node head) {
            if (head == null) {
                return;
            } else {
                rev(head.next);
                System.out.println(head.data);
            }
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.display(ll.head);
        System.out.println("Reversed linkedlist:");
        ll.rev(ll.head);

    }
}