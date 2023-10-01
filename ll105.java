public class ll105{
    public static class Node{
        char ch;
        Node next;
        Node(char c){
            this.ch=c;
            this.next=null;
        }
    }
    public static class Stack{
        Node head=null;
        void push(char ch){
            Node temp=new Node(ch);
            if(head==null){
                head=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }
        char pop(){
            if(head==null){
                System.out.println("Stack underflow..");
                char ch='0';
                return ch;
            }
            else{
                char ch=head.ch;
                head=head.next;
                return ch;
            }
        }
        
        int size() {
            int s = 0;
            if (head == null) {
                System.out.println("Stack underflow..");
                return -1;
            } 
            else {
                Node temp = head;
                while (temp != null) {
                    s++;
                    temp = temp.next;
                }
                return s;
            }
        }
        // char pop(){
        //     if(head==null){
        //         System.out.println("Stack underflow..");
        //         return -1;
        //     }
        //     else{
        //         char ch=head.ch;
        //         head=head.next;
        //         return ch;
        //     }
        // }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.ch);
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args){
        Stack st=new Stack();
        st.push('a');
        st.push('b');
        st.push('c');
        st.display();
    }
}