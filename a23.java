public class a23 {
    public static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public static void display(Node head) {
        Node temp = head;
        if (temp == null) {
            return;
        } else {
            System.out.println(temp.data);
            display(temp.next);
        }
    }

    public static void counnt(Node head) {
        Node temp = head;
        int count = 0;
        if (temp == null) {
            return;
        } else {
            while (temp != null) {
                temp = temp.next;
                count++;
            }
        }
        System.out.println("Total elements are: " + count);
    }
    //insertAtLast
    public static Node insertAtLast(Node head, int data){
        Node temp=head;
        Node newNode=new Node(data);
        if(temp==null){
            head=newNode;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return head;
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
        Node head=a;
        Node tail=d;
        display(a);
        counnt(a);
    }
}