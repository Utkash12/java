import java.util.*;
public class qu4{
    public static class queuea{
        private int f=-1;
        private int r=-1;
        int size=0;
        private int[] arr=new int[5];
        public void add(int val){
            if(r==arr.length-1){
                System.out.println("queue is full");
                return;
            }
            else if(f==-1){
                f=r=0;
                arr[0]=val;
            }
            else{
                arr[++r]=val;
            }
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is empty..");
                return -1;
            }
            else{
                int x=arr[f];
                f++;
                size--;
                return x;
            }
        }
        public int peek(){
            if(size==0){
                System.out.println("Queue is empty..");
                return -1;
            }
            else{
                int x=arr[f];
                return x;
            }
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is empty!");
            }
            else{
                for(int i=f;i<=r;i++){
                    System.out.println(arr[i]);
                }
            }
        }
    }
    public static void main(String[] args){
        queuea q=new queuea();
        q.add(2);
        q.add(4);
        q.add(6);
        q.add(8);
        q.add(10);
        q.display();
    }
}