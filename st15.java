import java.util.Scanner;
public class st15 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class Stack{
        Node head;
        int size;
        Stack(){
            this.head=null;
            this.size=0;
        }
        public void push(int data){
            Node node=new Node(data);
            node.next=head;
            head=node;
            size++;
        }
        public int pop(){
            if(size==0){
                System.out.println("Stack Underflow");
                return -1;
            }
            int val=head.data;
            head=head.next;
            size--;
            return val;
        }
        public int peek(){
            if(size==0){
                System.out.println("Stack Underflow");
                return -1;
            }
            return head.data;
        }
        public int size(){
            return size;
        }
        public boolean isEmpty(){
            return size==0;
        }
        public String toString(){
            Node temp=head;
            String str="";
            while(temp!=null){
                str+=temp.data+" ";
                temp=temp.next;
            }
            return str;
        }
    }
    public static void main(String[] args){
        Stack st=new Stack();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in Stack: ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            System.out.println("Enter the number to be entered: ");
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println("Stack before deletion: ");
        System.out.println(st);
    }
}
