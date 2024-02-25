import java.util.LinkedList;
public class p16{
    public static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        ll.head.next = second;
        second.next = third;
        third.next = fourth;
        ll.display();
        ll.count();
    }
    public static class linkedList{
        Node head;
        public void display() {
            if (head == null) {
                return;
            } else {
                System.out.println(head.data);
                display(head.next);
            }
        }
        public void rev() {
            if (head == null) {
                return;
            } else {
                rev(head);
                System.out.println(head.next);
            }
        }
        public void count() {
            int c = 0;
            while (head != null) {
                c++;
                head = head.next;
            }
            System.out.println("the number of nodes will be: " + c);
        }
        
    }
}