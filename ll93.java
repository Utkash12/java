public class ll93{
    public static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    public static class linkedlist{
        Node head=null;
        Node tail=null;
        void insertAt(int data){
            Node temp=new Node(data);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
        // void reverse(){
        //     Node prev=null;
        //     Node curr=head;
        //     Node next=null;
        //     while(curr!=null){
        //         next=curr.next;
        //         curr.next = prev;
        //         prev = curr;
        //         curr = next;
        //     }
        //     head=prev;
        // }
        // void reverse() {
        //     Node prev = null;
        //     Node next = null;
        //     Node current = head;
        //     while (current != null) {
        //         next = current.next;
        //         next.next = current;
        //         prev = current;
        //         current = next;
        //     }
        //     head = prev;
        // }
        
        void reverse() {
            Node prev = null;
            Node next = null;
            Node current = head;
            while (current != null) {
                next = current.next;
                next.next = current;
                prev = current;
                current = next;
            }
            head = prev;
        }
        
        // void reverse() {
        //     Node prev = null;
        //     Node curr = head;
        //     Node next = null;
        //     while (curr != null) {
        //         next = curr.next;
        //         curr.next = prev;
        //         prev = curr;
        //         curr = next;
        //     }
        //     head = prev;
        // }
    }
    public static void main(String[] args){
        linkedlist ll=new linkedlist();
        ll.insertAt(10);
        ll.insertAt(20);
        ll.insertAt(30);
        ll.insertAt(40);
        ll.display();
        System.out.println("After reversing:");
        ll.reverse();
        ll.display();
    }
}