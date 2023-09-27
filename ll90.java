// import java.util.Scanner;
public class ll90{
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
        void insertAt(int val){
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
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
        void reverse(){
            Node prev=null;
            Node curr=head;
            Node next=null;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;
        }
        // void revme(){
        //     Node temp=head;
        //     while(temp!=null){
        //         temp=temp.next;
        //         System.out.println(temp.data);
        //     }
        // }
    }
    public static void main(String[] args){
        linkedlist ll=new linkedlist();
        ll.insertAt(10);
        ll.insertAt(20);
        ll.insertAt(30);
        ll.display();
        System.out.println("After reversing");
        // ll.revme();
        System.out.println("After reversing");
        ll.reverse();
        ll.display();
    }
}