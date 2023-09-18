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
        //  public void insertAtHead(Node head,int val){
        //     Node temp=new Node(val);
        //     if(head==null){
        //         head=temp;
        //         tail=temp;
        //     }
        //     else{
        //         temp.next=head;
        //         head.prev=temp;
        //         head=temp;
        //     }
        // }
        void insertAtHead(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                temp.next=head;
                head.prev=temp;
                head=temp;
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
        public void insertAtTail(int val){
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
        public void insertAt(int idx,int val){
            Node temp=new Node(val);
            Node curr=head;
            int i=0;
            while(i<idx-1){
                curr=curr.next;
                i++;
            }
            temp.next=curr.next;
            curr.next.prev=temp;
            curr.next=temp;
            temp.prev=curr;
        }
        
        public void insertAt2(int val, int idx) {
            Node t = head;
            for (int i = 1; i < idx; i++) {
                t = t.next;
            }
            Node temp = new Node(val);
            temp.next = t.next;
            t.next = temp;
            t.next = temp;
            temp.prev = t;

        }
        public void random(Node rand){
            Node temp=rand;
            while(temp.prev!=null){
                temp=temp.prev;
            }
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
        System.out.println("Normal linkedlist: ");
        ll.display();
        System.out.println("Reversed linkedlist: ");
        ll.reverse();
        System.out.println("Data at node 2:");
        // Node rand=ll.random(ll.head.next);
        // System.out.println(rand.data);
        ll.random(ll.head);
        // ll.insertAtHead(ll.head,10);
        // System.out.println("After inserting at head: ");
        // ll.display();
        ll.insertAtHead(0);
        System.out.println("After inserting at head: ");
        ll.display();
        ll.insertAtTail(10);
        System.out.println("After inserting at tail: ");
        ll.display();
        ll.insertAt(2,500);
        System.out.println("After inserting at index 2: ");
        ll.display();
        ll.insertAt2(100,2);
        System.out.println("After inserting at index 2: ");
        ll.display();
    }
}