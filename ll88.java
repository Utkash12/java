public class ll88{
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
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
        void reverse(){
            Node temp=tail;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.prev;
            }
        }
        public static Node random(Node rand){
            Node temp=rand;
            while(temp.prev!=null){
                temp=temp.prev;
            }
            return temp;
        }
    }
    public static void main(String[] args){
        linkedlist ll=new linkedlist();
        ll.insertAt(2);
        ll.insertAt(4);
        ll.insertAt(6);
        ll.insertAt(8);
        System.out.println("Normal linkedlist: ");
        ll.display();
        System.out.println("Reversed linkedlist: ");
        ll.reverse();
        System.out.println("Data at node 2:");
        Node rand=ll.random(ll.head.next);
        System.out.println(rand.data);
        
    }
}