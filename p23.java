public class p23{
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
        void ins(int data,int idx){
            Node temp=new Node(data);
            Node trav=head;
            for(int i=0;i<idx-1;i++){
                trav=trav.next;
            }
            temp.next=trav.next;
            trav.next=temp;
        }
        void inse(int data,int idx){
            Node temp=new Node(data);
            Node trav=head;
            for(int i=0;i<idx;i++){
                trav=trav.next;
            }
            trav.next=temp;
            temp.next.next=trav.next;
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

        void display() {
            Node temp = head;
            if (head == null) {
                System.out.println("Empty linkedlist...");
            } else {
                while (temp != null) {
                    System.out.println(temp.data);
                    temp = temp.next;
                }
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
        ll.insert(2);
        ll.ins(100, 3);
        ll.inse(200, 3);
        ll.display();
    }
}