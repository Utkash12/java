public class s10 {
    public static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public static class Stack {
        Node head;
        int size = 0;

        void push(int x) {
            Node node = new Node(x);
            if (size == 0) {
                head = node;
                size++;
            } else {
                node.next = head;
                head = node;
                size++;
            }
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
        void pop(){
            if(head==null){
                System.out.println("Stack is empty");
                return;
            }
            System.out.println(head.data);
            head=head.next;
            size--;
        }
        void peek(){
            if(head==null){
                System.out.println("Stack is empty");
                return;
            }
            else{
                System.out.println(head.data);
            }
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display();
        st.pop();
        st.display();
        st.peek();
    }
}