import java.util.*;
public class qu2{
    public static class queuee{
        int f=-1;
        int r=-1;
        int size=0;
        int[] arr=new int[6];
        public int size(){
            if(size==0){
                System.out.println("Queue is empty..");
                return -1;
            }
            else{
                return size;
            }
        }
        public void add(int val){
            if(f==-1){
                f=r=0;
            }
            else if(r==arr.length-1){
                System.out.println("Queue is full..");
            }
            else{
                arr[++r]=val;
            }
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
            if(arr.size==0){
                System.out.println("queue is empty..");
            }
            else{
                int x=arr[f];
                return x;
            }
        }
        public boolean isEmpty(){
            if(arr.size()==0){
                return true;
            }
            else{
                return false;
            }
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is empty..");
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
        q.display();
    }
}