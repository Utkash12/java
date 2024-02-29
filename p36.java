

public class p36 {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    static class linkedlist {
        Node head = null;
        Node tail = null;

        void insertAt(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        void display() {
            Node temp =  head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAt(10);
        ll.insertAt(20);
        ll.insertAt(30);
        ll.insertAt(40);
        ll.display();
    }
}