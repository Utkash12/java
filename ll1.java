public class ll1 {
    public static class Nde{
        int data;
        Nde next;
        Nde(int data){
            this.data=data;
            // this.next=null;
        }
    }
    public static void main(String[] args){
        Nde a=new Nde(5);
        Nde b=new Nde(6);
        Nde c=new Nde(7);
        a.next=b;
        b.next=c;
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
    }
}
