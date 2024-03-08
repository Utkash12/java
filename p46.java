public class p46 {
    public static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public static Node remove(Node head,int n){
        Node slow=head;
        Node fast=head;
        // for(int i=0;i<n;i++){
        //     fast=fast.next;
        // }
        // while(fast!=null){
        //     slow=slow.next;
        //     fast=fast.next;
        // }
        // return slow;
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
        Node q = remove(a, 2);
        System.out.println(q.data);
    }
}