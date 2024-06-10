public class a40 {
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
    //sum of two pointers equals to target
    public static void check(Node head, int target) {
        Node temp = head;
        Node temp1 = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        while (temp1 != null && temp != null && temp1 != temp) {
            if (temp1.data + temp.data == target) {
                System.out.println("The sum of " + temp1.data + " and " + temp.data + " is equal to " + target);
                temp1 = temp1.next;
                temp = temp.prev;
            } else if (temp1.data + temp.data < target) {
                temp1 = temp1.next;
            } else {
                temp = temp.prev;
            }
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(6);
        Node e = new Node(7);
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
        check(a, target);
    }
}