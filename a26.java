public class a26 {
    public static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }
    public static class linkedlist{
        Node head=null;
        Node tail=null;
        public void insertAtLast(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=newNode;
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
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertAtLast(10);
        ll.insertAtLast(20);
        ll.insertAtLast(30);
        ll.insertAtLast(40);
        ll.display();
    }
}
