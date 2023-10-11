import java.util.*;
public class qu5{
    public static class queuee{
        private int f=-1;
        private int r=-1;
        int size=0;
        private int[] arr=new int[5];
        public void add(int val){
            if(f==-1){
                f=0;
                r=0;
                arr[0]=val;
                size++;
            }
            else if(r==arr.length-1){
                System.out.println("Queue is full");
                return;
            }
            else{
                arr[++r]=val;
                size++;
            }
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is empty");
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
                System.out.println("Queue is empty..");
            }
            else{
                for(int i=f;i<r;i++){
                    System.out.println(arr[i]);
                }
            }
        }
    }
    public static void main(String[] args){
        queuee q=new queuee();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.display();
    }
}