public class ll21{
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
        void display(int count){
        Node temp=head;
        count=0;
        while(temp!=null){
            count++;
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println("The number of nodes in the linked list is "+count);
    }
}
    public static void main(String[] args){
        linkedlist ll=new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(10);
        ll.insertAtEnd(6);
        ll.insertAtEnd(6);
        int count=0;
        ll.display(count);
    }
}