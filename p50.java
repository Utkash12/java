public class p50 {
    public static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }
    static void display(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    static int length(Node head){
        int len=0;
        while(head!=null){
            len++;
            head=head.next;
        }
        return len;
    }
    // void intersection(Node head1, Node head2){
    //     int len1=length(head1);
    //     int len2=length(head2);
    //     if(len1>len2){
    //         int diff=len1-len2;
    //         while(diff>0){
    //             head1=head1.next;
    //             diff--;
    //         }
    //     }
    //     else{
    //         int diff=len2-len1;
    //         while(diff>0){
    //             head2=head2.next;
    //             diff--;
    //         }
    //     }
    //     while(head1!=null && head2!=null){
    //         if(head1==head2){
    //             System.out.println(head1.data);
    //             break;
    //         }
    //         head1=head1.next;
    //         head2=head2.next;
    //     }
    // }
    public static Node intersection(Node head1, Node head2){
        int len1=length(head1);
        int len2=length(head2);
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
        // Node head1=a;
        // Node head2=x;
        display(a);
        System.out.println();
        display(x);
        length(a);
        length(x);
        //difference in length of linked list
        // int len1=length(a);
        // int len2=length(x);
        // if(len1>len2){
        //     int diff=len1-len2;
        //     while(diff>0){
        //         a=a.next;
        //         diff--;
        //     }
        // }
        // else{
        //     int diff=len2-len1;
        //     while(diff>0){
        //         x=x.next;
        //         diff--;
        //     }
        // }
        // while(a!=null && x!=null){
        //     if(a==x){
        //         System.out.println(a.data);
        //         break;
        //     }
        //     a=a.next;
        //     x=x.next;
        // }
        Node p=intersection(a, x);
        System.out.println(p.data);
    }
}