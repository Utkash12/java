public class ll101{
    public static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    public static class Stack{
        Node head=null;
        int size=0;
        void push(int data){
            Node temp=new Node(data);
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
       int pop(){
           if(head==null){
               System.out.println("Stack underflow..");
               return -1;
           }
           else{
               Node temp=head;
               System.out.println(temp.data);
            //   temp.data=0;
               head=head.next;
               size--;
               return temp.data;
           }
       }
       int size(){
           int s=0;
           if(head==null){
               System.out.println("Stack underflow..");
               return -1;
           }
           else{
               Node temp=head;
               while(temp!=null){
                   temp=temp.next;
                   s++;
               }
               return s;
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
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.display();
        // System.out.println("After pop");
        // st.pop();
        // st.pop();
        System.out.println("Size"+ st.size());
        // st.display();
    }
}