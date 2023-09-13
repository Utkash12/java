public class ll60{
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
        void count(){
            int c=0;
            Node temp=head;
            while(temp!=null){
                c++;
            }
            System.out.println(c);
        }
        int countrec(Node head){
            if(head==null){
                return 0;
            }
            return 1+countrec(head.next);
        }
        public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
    public static void main(String[] args){
        linkedlist ll=new linkedlist();
        ll.insertAtEnd(2);
        ll.insertAtEnd(4);
        ll.insertAtEnd(6);
        ll.insertAtEnd(8);
        ll.insertAtEnd(10);
        ll.display();
        ll.count();
        System.out.println("the count is"+ll.countrec(ll.head));
    }
}