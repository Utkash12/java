public class ll86{
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
        void insertAt(int val){
            Node temp=new Node(val);
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
    }
    public static Node middle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args){
        linkedlist ll=new linkedlist();
        ll.insertAt(2);
        ll.insertAt(4);
        ll.insertAt(6);
        ll.insertAt(8);
        ll.insertAt(9);
        ll.insertAt(10);
        ll.insertAt(12);
        ll.display();
        System.out.println("The middle element will be : "+ middle(ll.head).data);
    }
}