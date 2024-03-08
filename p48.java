//intersection of two linked lists
public class p48 {
    public static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }
    public static Node intersection(Node head1, Node head2){
        // Node a=head1;
        // Node b=head2;
        // while(a!=b){
        //     a=a==null?head2:a.next;
        //     b=b==null?head1:b.next;
        // }
        // return a;
        Node temp1=head1;
        Node temp2=head2;
        int len1=0;
        int len2=0;
        while(temp1!=null){
            len1++;
            temp1=temp1.next;
        }
        while(temp2!=null){
            len2++;
            temp2=temp2.next;
        }
        if(len1>len2){
            int diff=len1-len2;
            while(diff>0){
                head1=head1.next;
                diff--;
            }
        }
        else{
            int diff=len2-len1;
            while(diff>0){
                head2=head2.next;
                diff--;
            }
        }
        while(head1!=null && head2!=null){
            if(head1==head2){
                return head1;
            }
            head1=head1.next;
            head2=head2.next;
        }
        return null;
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
        Node k = new Node(110);
        Node l = new Node(120);
        Node m = new Node(130);
        Node n = new Node(140);
        Node o = new Node(150);
        k.next = l;
        l.next = m;
        m.next = n;
        n.next = o;
        o.next = g;
        g.next = h;
        h.next = i;
        i.next = j;
        j.next = null;
        Node p = intersection(a, k);
        System.out.println(p.data);
    }
}
