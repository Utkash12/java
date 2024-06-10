public class a41{
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

    public static void sum(Node head,int target){
        Node tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        Node temp=head;
        while(temp.data<tail.data){
            if(temp.data+tail.data==target){
                System.out.println("The sum of "+temp.data+" and "+tail.data+" is equal to "+target);
                temp=temp.next;
                tail=tail.prev;
            }
            else if(temp.data+tail.data<target){
                temp=temp.next;
            }
            else{
                tail=tail.prev;
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
        sum(a, target);
    }
}