public class s7 {
    public static class Stack{
        int[] arr=new int[5];
        int idx=-1;
        public void push(int val){
            if(idx==4){
                System.out.println("Stack is full");
                return;
            }
            arr[++idx]=val;
        }
        public int pop(){
            if(idx==-1){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[idx--];
        }
        public int size(){
            return idx+1;
        }
        public int peek(){
            if(idx==-1){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[idx];
        }
        public void display(){
            for(int i=0;i<=idx;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        public boolean isEmpty(){
            return idx==-1;
        }
        public boolean isFull(){
            return idx==4;
        }
    }
    public static void main(String[] args){
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        int idx=3;
        st.display();
        Stack rt=new Stack();
        while(st.size()>=3){
            rt.push(st.pop());
        }
        st.push(200);
        while(rt.size()>0){
            st.push(rt.pop());
        }
    }
}
