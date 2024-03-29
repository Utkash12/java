public class p20 {
    public static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;

        void insertAt(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }
        void delete(){
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
        }
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

        void insert(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }
        void del(){
            head=head.next;
            while(head!=null){
                System.out.println(head.data);
                head=head.next;
            }
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAt(10);
        ll.insertAt(20);
        ll.insertAt(30);
        ll.insertAt(40);
        ll.insert(1);
        ll.insert(-1);
        ll.display();
        ll.delete();
        System.out.println("After deletion");
        ll.display();
        System.out.println("After deletion");
        ll.del();
        ll.display();
    }
}