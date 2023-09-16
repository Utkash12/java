public class ll76{
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
    }
}