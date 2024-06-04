public class a21 {
    public static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public static void count(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("The total number are: " + count);
    }

    public static void revdisp(Node head) {
        Node temp = head;
        if (temp == null) {
            return;
        } else {
            revdisp(temp.next);
            System.out.println(temp.data);
        }
    }

    public static void disp(Node head) {
        Node temp = head;
        if (temp == null) {
            return;
        } else {
            System.out.println(temp.data);
            disp(temp.next);
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
        disp(a);
        revdisp(a);
        count(a);
    }
}