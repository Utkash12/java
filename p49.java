public class p49 {
    public static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }
    
    void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + "  ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);
        Node x = new Node(11);
        Node y = new Node(12);
        Node z = new Node(13);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = null;
        x.next = y;
        y.next = z;
        z.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = null;
        Node head1=a;
        Node head2=x;
        // display(a);
        // display(x);
        // display(intersection(a, x));
        //display whole linked list
        while(a!=null){
            System.out.print(a.data+" ");
            a=a.next;
        } 
        System.out.println();
        while(x!=null){
            System.out.print(x.data+" ");
            x=x.next;
        }
        int len1=0;
        int len2=0;
        Node temp1=a;
        Node temp2=x;
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
                System.out.println("The intersection point will be: "+head1.data);
                break;
            }
            // head1=head1.next;
            // head2=head2.next;
            else{
                head1=head1.next;
                head2=head2.next;
            }
        }
        //print intersection point
        System.out.println("The intersection point will be: "+head1.data);

    }
}