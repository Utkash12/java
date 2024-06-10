public class a42 {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int d) {
            this.data = d;
            this.next = null;
            this.prev = null;
        }
    }
    //critical point local maximas and minimas longest distance
    public static void critical(Node head) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.data > temp.next.data) {
                System.out.println("The critical point is " + temp.data);
            }
            temp = temp.next;
        }
    }
    
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(5);
        Node c = new Node(4);
        Node d = new Node(6);
        Node e = new Node(12);
        Node f = new Node(9);
        int target = 10;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = null;
        f.prev = e;
        e.prev = d;
        d.prev = c;
        c.prev = b;
        b.prev = a;
        a.prev = null;
        critical(a);
    }
}