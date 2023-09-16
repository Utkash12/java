public class ll77{
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
    public static Node merge(Node head1,Node head2){
        Node temp1=head1;
        Node temp2=head2;
        Node temp=new Node(100);
        Node head=temp;
        while(temp1!=null && temp2!=null){
            if(temp1.data<temp2.data){
                Node a=new Node(temp1.data);
                temp.next=a;
                temp=a;
                temp1=temp1.next;
            }
            else{
                Node a=new Node(temp2.data);
                temp.next=a;
                temp=a;
                temp2=temp2.next;
            }
        }
        if(temp1==null){
            temp.next=temp2;
        }
        else{
            temp.next=temp1;
        }
        return head.next;
    }
    public static void main(String[] args){
        linkedlist ll1=new linkedlist();
        ll1.insertAt(1);
        ll1.insertAt(3);
        ll1.insertAt(5);
        ll1.insertAt(7);
        ll1.insertAt(9);
        ll1.insertAt(11);
        ll1.insertAt(13);
        ll1.insertAt(15);
        ll1.display();
        linkedlist ll2=new linkedlist();
        ll2.insertAt(2);
        ll2.insertAt(4);
        ll2.insertAt(6);
        ll2.insertAt(8);
        ll2.insertAt(10);
        ll2.insertAt(12);
        ll2.insertAt(14);
        ll2.display();
        System.out.println("Merged linkedlist: ");
        Node head=merge(ll1.head,ll2.head);
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}