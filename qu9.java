import java.util.*;
public class qu9 {
    public static class cqa{
        int front=-1;
        int rear=-1;
        int size=0;
        int[] arr=new int[8];
        public void add(int val){
            if(size==0){
                front=rear=0;
                arr[front]=val;
                size++;
            }
            else if(size==arr.length){
                System.out.println("Queue is full");
            }
            else if(front<=rear){
                if(rear==arr.length-1){
                    rear=0;
                    arr[rear]=val;
                    size++;
                }
                else{
                    rear++;
                    arr[rear]=val;
                    size++;
                }
            }
            else if(rear<front){
                if(rear==arr.length-1){
                    rear=0;
                    arr[rear]=val;
                    size++;
                }
                else{
                    rear++;
                    arr[rear]=val;
                    size++;
                }
            }
        }
    }
}
