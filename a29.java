public class a29{
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

        void insertAtend(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        void insertAtstart(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

        void insertAtmid(int pos, int data) {
            Node tempp = new Node(data);
            Node temp = head;
            for (int i = 0; i < pos; i++) {
                temp = temp.next;
            }
            tempp.next = temp.next;
            temp.next = tempp;
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtend(10);
        ll.insertAtend(20);
        ll.insertAtend(30);
        ll.insertAtstart(1);
        ll.insertAtstart(2);
        ll.display();
        ll.insertAtmid(2,100 );
        ll.display();
    }
}