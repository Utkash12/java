public class ll24{
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
        void insertAtEnd(int val){
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
        void insertAtHead(int val){
           Node temp=new Node(val);
           if(head==null){
               head=temp;
               tail=temp;
           }
           else{
               temp.next=head;
               head=temp;
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
    public static void main(String[] args){
        linkedlist ll=new linkedlist();
        ll.insertAtEnd(5);
        ll.insertAtEnd(10);
        ll.insertAtEnd(15);
        ll.insertAtEnd(20);
        ll.insertAtHead(2);
        ll.insertAtHead(4);
        ll.insertAtHead(6);
        ll.display();
    }
}
