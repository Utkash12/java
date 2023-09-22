public class st13{
    public static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    public static class llstack{
        Node head=null;
        int size=0;
        void push(int x){
            Node temp=new Node(x);
            if(head==null){
                head=temp;
                size++;
            }
            else{
                temp.next=head;
                head=temp;
                size++;
            }
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
        int size(){
            return size;
        }
        
        int pop() {
            Node temp = head;
            if (head == null) {
                System.out.println("Stack is empty...");
                return -1;
            } 
            else {
                int x = head.data;
                head = head.next;
                return x;
            }
        }
    }
    public static void main(String[] args){
        llstack st=new llstack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.display();
        System.out.println(st.size());
        System.out.println(st.pop());
        
    }
}