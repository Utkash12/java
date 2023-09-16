public class ll75{
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
        public void display(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
    public static class linkedlist2{
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
        public void display(){
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
        Node head=null;
        Node tail=null;
        while(temp1!=null && temp2!=null){
            if(temp1.data<temp2.data){
                if(head==null){
                    head=temp1;
                    tail=temp1;
                }
                else{
                    tail.next=temp1;
                    tail=temp1;
                }
                temp1=temp1.next;
            }
            else{
                if(head==null){
                    head=temp2;
                    tail=temp2;
                }
                else{
                    tail.next=temp2;
                    tail=temp2;
                }
                temp2=temp2.next;
            }
        }
        if(temp1!=null){
            tail.next=temp1;
        }
        if(temp2!=null){
            tail.next=temp2;
        }
        return head;
    }
    public static void main(String[] args){
        linkedlist ll=new linkedlist();
        ll.insertAt(1);
        ll.insertAt(4);
        ll.insertAt(7);
        ll.insertAt(9);
        ll.insertAt(11);
        ll.insertAt(13);
        ll.insertAt(16);
        ll.display();
        System.out.println("head"+ll.head.data);
        System.out.println("Second linkedlist: ");
        linkedlist2 l2=new linkedlist2();
        l2.insertAt(2);
        l2.insertAt(5);
        l2.insertAt(8);
        l2.insertAt(10);
        l2.insertAt(12);
        l2.insertAt(14);
        l2.insertAt(17);
        l2.display();
        System.out.println("head"+l2.head.data);
        ll75 ll1=new ll75();
        Node head=ll1.merge(ll.head,l2.head);
        System.out.println("Merged linkedlist: ");
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }

    }
}