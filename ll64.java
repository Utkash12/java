public class ll64{
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
        void insert(int val){
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
                temp=temp.next;
            }
            System.out.println("The total count will be: "+ c);
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
        ll.insert(2);
        ll.insert(4);
        ll.insert(6);
        ll.insert(8);
        ll.insert(10);
        ll.display();
        ll.count();
    }
}