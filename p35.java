public static class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
static class linkedlist{
    Node head=null;
    Node tail=null;
    void insertAt(int d){
        Node temp=new Node(d);
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
        Node current=head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        // System.out.println("Nodes of singly linked list: ");
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
    // reverse recursively
    void rev(Node head){
        if(head==null){
            // System.out.println("List is empty");
            return;
        }
        else{
            rev(head);
            System.out.println(head.next);
        }
    }
}
public class p35{
    public static void main(String[] args) {
        linkedlist list=new linkedlist();
        list.insertAt(1);
        list.insertAt(2);
        list.insertAt(3);
        list.insertAt(4);
        list.insertAt(5);
        list.display();
        list.rev(list.head);

    }
}