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
    public static void main(String[] args){
        linkedlist ll=new linkedlist();
        ll.insertAt(1);
        ll.insertAt(2);
        ll.insertAt(3);
        ll.insertAt(4);
        ll.insertAt(5);
        ll.insertAt(6);
        ll.insertAt(7);
        ll.display();
        System.out.println("Second linkedlist: ");
        linkedlist2 l2=new linkedlist2();
        l2.insertAt(1);
        l2.insertAt(2);
        l2.insertAt(30);
        l2.insertAt(4);
        l2.insertAt(5);
        l2.insertAt(6);
        l2.insertAt(7);
        l2.display();
    }
}