public class ll94{
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
        void insertStart(int data){
            Node temp=new Node(data);
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
        ll.insertAt(10);
        ll.insertAt(20);
        ll.insertAt(30);
        ll.insertAt(40);
        ll.display();
        System.out.println("After insertion:");
        ll.insertStart(10);
        ll.insertStart(20);
        ll.display();
    }
}