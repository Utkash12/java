public class ll15{
    public static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    public static void display(Node head){
        int count=0;
        if(head==null){
            return;
        }
        else{
            System.out.println(head.data);
            display(head.next);
            count++;
        }
        System.out.println("The total number of elements will be: "+count);
    }
    
    public static void reverse(Node head){
        if(head==null){
            return;
        }
        else{
            reverse(head.next);
            System.out.println(head.data);
        }
        
    }
    public static void main(String[] args){
        // System.out.println("The total number of elements will be: "+count);
        Node a=new Node(5);
        Node b=new Node(10);
        Node c=new Node(15);
        Node d=new Node(20);
        a.next=b;
        b.next=c;
        c.next=d;
        Node temp=a;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println("The total number of elements will be: "+count);
        System.out.println("The list will be: ");
        display(a);
        System.out.println("The reverse list will be: ");
        reverse(a);
    }
}