public class ll56 {
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
        void insertAt(int idx,int val){
            Node temp=new Node(val);
            Node t=head;
            for(int i=1;i<=idx;i++){
                t=t.next;
            }
            t.next=temp.next;
            temp.next=t;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertAtEnd(2);
        ll.insertAtEnd(4);
        ll.insertAtEnd(6);
        ll.insertAtEnd(8);
        ll.insertAtEnd(10);
        ll.insertAtEnd(12);
        ll.insertAtEnd(14);
        ll.insertAtHead(1);
        ll.insertAtHead(2);
        ll.insertAtHead(3);
        ll.insertAt(3,100);
        ll.display();
    }
}
