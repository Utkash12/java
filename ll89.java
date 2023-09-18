public class ll89{
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int d){
            this.data=d;
            this.next=null;
            this.prev=null;
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
                temp.prev=tail;
                tail=temp;
            }
        }
        void deleteHead(){
            Node temp=head.next;
            temp.prev=null;
            head=temp;
        }
        void deleteTail(){
            Node temp=tail.prev;
            temp.next=null;
            tail=temp;
        }
        // void deleteAt(int idx){
        //     Node temp=head;
        //     for(int i=1;i<=idx;i++){
        //         temp=temp.next;
        //     }
        //     temp.next=temp.next.next;
        //     temp.next.prev=temp;
        // }
        void deleteAt(int idx){
            Node temp=head;
            for(int i=1;i<idx;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            temp.next.prev=temp;
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
        linkedlist ll=new linkedlist();
        ll.insertAt(2);
        ll.insertAt(4);
        ll.insertAt(6);
        ll.insertAt(8);
        ll.insertAt(10);
        ll.insertAt(12);
        ll.insertAt(14);
        ll.display();
        ll.deleteHead();
        System.out.println("After deletion of head: ");
        ll.display();
        System.out.println("After deletion of tail: ");
        ll.deleteTail();
        ll.display();
        System.out.println("After deleting at specific point: ");
         ll.deleteAt(2);
        ll.display();
    }
    
}