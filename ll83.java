public class ll83{
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
    public static Node evenodd(Node head){
        Node temp=head;
        Node head1=new Node(4);
        Node head2=new Node(5);
        Node temp1=head1;
        Node temp2=head2;
        while(temp!=null){
            if(temp.data%2==0){
                temp1.next=temp;
                temp=temp.next;
                temp1=temp1.next;
            }
            else{
                temp2.next=temp;
                temp=temp.next;
                temp2=temp2.next;
            }
        }
        temp1.next=head2.next;
        temp2.next=null;
        return head1.next;
    }
    public static void main(String[] args){
        linkedlist ll=new linkedlist();
        ll.insertAt(1);
        ll.insertAt(2);
        ll.insertAt(3);
        ll.insertAt(4);
        ll.insertAt(5);
        ll.insertAt(6);
        ll.insertAt(7);
        ll.insertAt(8);
        ll.display();
        System.out.println("after even odd: ");
        Node head=evenodd(ll.head);
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }

    }
}