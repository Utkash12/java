public class qu8 {
    public static class Cqa{
        int front=-1;
        int rear=-1;
        int size=0;
        int[] arr=new int[8];
        public void add(int val) throws Exception{
            if(size==arr.length){
                throw new Exception("Queue is full");
            }
            else if(size==0){
                front=rear=0;
                arr[0]=val;

            }
            else if(rear<arr.length-1){
                arr[++rear]=val;  //normal case
            }
            else if(rear==arr.length-1){
                rear=0;
                arr[0]=val;
            }
            size++;
        }
        public int remove() throws Exception{
            if(size==0){
                throw new Exception("Queue is empty");
            }
            else{
                int val=arr[front];
                if(front==arr.length-1)front=0;
                else front++;
                size--;
                return val;
            }

        }
        public int peek() throws Exception{
            if(size==0){
                throw new Exception("Queue is empty");
            }
            else return arr[front];
        }
        public boolean isEmpty(){
            if(size==0)return true;
            else return false;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is empty");
                return;
            }
            else if(front<=rear){
                for(int i=front;i<=rear;i++){
                    System.out.println(arr[i]);
                }
            }
            else{ //rear<front
                for(int i=front;i<arr.length;i++){
                    System.out.println(arr[i]);
                }
            }
        }
    }
    public static void main(String[] args){
        Cqa q=new Cqa();
        q.display();
        
            // q.add(10);
            // q.add(20);
            // q.add(30);
            // q.add(40);
            // q.add(50);
        
        q.display();
    }
}
