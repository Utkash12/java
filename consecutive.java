import java.util.Scanner;
public class consecutive{
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
        void push(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }
        int pop(){
            if(head==null){
                System.out.println("Stack underflow..");
                return -1;
            }
            else{
                int val=head.data;
                head=head.next;
                return val;
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
                    s++;
                    temp=temp.next;
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
    public static void main(String[] args) {
        Stack st=new Stack();
        Scanner sc=new Scanner(System.in);
        
    }
}