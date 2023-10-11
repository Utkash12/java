import java.util.*;
public class qu3 {
    public static class queuee{
        private int f=-1;
        private int r=-1;
        private int size=0;
        private int[] arr=new int[6];
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
        // public int peek(){
        //     if(arr.size==0){
        //         System.out.println("queue is empty..");
        //     }
        //     else{
        //         int x=arr[f];
        //         return x;
        //     }
        // }
        // public boolean isEmpty(){
        //     if(arr.size()==0){
        //         return true;
        //     }
        //     else{
        //         return false;
        //     }
        // }
        public void display(){
            if(size==0){
                System.out.println("Queue is empty..");
            }
            else{
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args){
        queuee q=new queuee();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.display();

    }
}
