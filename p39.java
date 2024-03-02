
public class p39{
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

        // void display(Node head) {
        //     if (head == null) {
        //         return;
        //     } else {
        //         head = head.next;
        //         System.out.println(head.data);
        //     }
        // }
        // void display() {
        //     Node temp = head;
        //     while (temp != null) {
        //         System.out.println(temp.data);
        //         temp = temp.next;
        //     }
        // }
        //display linkedlist recursively
        void display(Node head){
            if(head==null){
                return;
            }else{
                System.out.println(head.data);
                display(head.next);
            }
        }
    }
    public static void main(String[] args){
        linkedlist ll=new linkedlist();
        
        ll.display(Node head);
    }
}