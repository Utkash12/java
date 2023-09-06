public class ll29{
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
        void insertAtHead(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }
        void delete(int index){
            Node temp=head;
            for(int i=1;i<=index-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
        int getAt(int index){
            Node temp=head;
            for(int i=1;i<=index;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        void insertAt(int ind,int val){
            Node temp=head;
            Node t=new Node(val);
            if(ind==0){
                t.next=head;
                head=t;
            }
            else if(ind==size()){
                tail.next=t;
                tail=t;
            }
            else{
            for(int i=1;i<=ind-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }
        }
        int size(){
            Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
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
        ll.insertAtEnd(5);
        ll.insertAtEnd(7);
        ll.insertAtEnd(9);
        ll.insertAtEnd(11);
        // ll.display();
        ll.insertAtHead(2);
        ll.insertAtHead(4);
        ll.insertAtHead(6);
        ll.insertAtHead(8);
        // ll.display();
        ll.insertAt(3,100);
        ll.insertAt(6,200);
        ll.display();
        System.out.println("The element at index 3 is "+ll.getAt(3));
        ll.delete(3);
        ll.delete(5);
        ll.delete(0);
        System.out.println("After deletion");
        ll.display();
    }
}