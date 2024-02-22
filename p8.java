public class p8 {
    public static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    
    // public static void disp(Node head) {
    //     if (head == null) {
    //         return;
    //     } else {
    //         System.out.println(head.data);
    //         head = head.next;
    //     }
    // }
    // display linkedlist recursively
    public static void disp(Node head) {
        if (head == null) {
            return;
        } else {
            System.out.println(head.data);
            disp(head.next);
        }
    }
    public static void display(Node head) {
        Node temp = head;
        while (temp.next != null) {
            System.out.println(temp.next.data);
            temp = temp.next;
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
        display(a);
        disp(a);
    }
}