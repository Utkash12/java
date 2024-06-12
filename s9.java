//implement stack using linked list
public class s9{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class Stack{
        Node head;
        public void push(int val){
            Node node=new Node(val);
            if(head==null){
                head=node;
            }else{
                node.next=head;
                head=node;
            }
        }
        public int pop(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            int val=head.data;
            head=head.next;
            return val;
        }
        public void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display();
        
    }
}