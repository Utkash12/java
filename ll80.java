public class ll80{
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
        ll1.insertAt(2);
        ll1.insertAt(4);
        ll1.insertAt(6);
        ll1.insertAt(8);
        ll1.insertAt(10);
        System.out.println("first linkedlist: ");
        ll1.display();
        linkedlist ll2=new linkedlist();
        ll2.insertAt(1);
        ll2.insertAt(3);
        ll2.insertAt(5);
        ll2.insertAt(7);
        ll2.insertAt(9);
        System.out.println("second linkedlist: ");
        ll2.display();
    }
}