public class a27 {
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
        public void insertAtFirst(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
                newNode.next=head;
                head=newNode;
            }
        }
        public void insertAtMiddle(int data, int pos){
            Node newNode=new Node(data);
            Node temp=head;
            for(int i=0;i<pos-1;i++){
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
        // public void deleteAtFirst(){
        //     if(head==null){
        //         System.out.println("List is empty");
        //     }
        //     else{
        //         head=head.next;
        //     }
        // }
        // public void deleteAtLast(){
        //     Node temp=head;
        //     while(temp.next.next!=null){
        //         temp=temp.next;
        //     }
        //     temp.next=null;
        //     tail=temp;
        // }
        // public void deleteAtMiddle(int pos){
        //     Node temp=head;
        //     for(int i=0;i<pos-1;i++){
        //         temp=temp.next;
        //     }
        //     temp.next=temp.next.next;
        // }
    }
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertAtLast(10);
        ll.insertAtLast(20);
        ll.insertAtLast(30);
        ll.insertAtLast(40);
        ll.insertAtFirst(5);
        ll.insertAtMiddle(15, 2);
        ll.display();
    }
}
