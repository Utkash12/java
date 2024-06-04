public class a24{
    public static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    // public static void display(Node head){
    // Node temp=head;
    // while(temp!=null){
    // System.out.println(temp.data);
    // temp=temp.next;
    // }
    // }
    // public static void recdis(Node head) {
    //     Node temp = head;
    //     if (temp == null) {
    //         return;
    //     } else {
    //         while (temp != null) {
    //             System.out.println(temp.data);
    //             recdis(temp.next);
    //         }
    //     }
    // }
    // print recursively
    public static void recdis(Node head) {
        Node temp = head;
        if (temp == null) {
            return;
        } else {
            System.out.println(temp.data);
            recdis(temp.next);
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
        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        // display(a);
        recdis(a);
    }
}