import java.util.*;
public class qu6{
    public static class queuee{
        private int f=-1;
        private int r=-1;
        int size=0;
        int[] arr=new int[6];
        public void add(int val){
            if(size==arr.length){
                System.out.println("Queue is full");
            }
            else if(size==0){
                f=r=0;
                arr[r]=val;
                size++;
            }
            else{
                ++r;
                arr[r]=val;
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
                f--;
                size--;
                return x;
            }
        }
        public void peek(){
            if(size==0){
                System.out.println("Queue is empty");
            }
            else{
                int x=arr[f];
                System.out.println(x);
            }
        }
        void display(){
            if(size==0){
                System.out.println("Queue is empty");
            }
            else{
                for(int i=f;i<=r;i++){
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