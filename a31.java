public class a31{
    public static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }
    public static void intersection(Node head1,Node head2){
        Node temp1=head1;
        Node temp2=head2;
        int length1=0;
        int length2=0;
        while(temp1!=null){
            length1++;
            temp1=temp1.next;
        }
        while(temp2!=null){
            length2++;
            temp2=temp2.next;
        }
        if(length1>length2){
            int diff=length1-length2;
            
        }
    }

    public static void middle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);

    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        Node g = new Node(70);
        Node h = new Node(80);
        Node i = new Node(90);
        Node j = new Node(100);
        // Node head = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = j;
        j.next = null;
        middle(a);
    }
}