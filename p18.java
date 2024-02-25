public class p18 {
    public static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;

        void insertAt(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        void display() {
            while (head != null) {
                System.out.println(head.data);
                head = head.next;
            }
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAt(10);
        ll.insertAt(20);
        ll.display();
    }
}