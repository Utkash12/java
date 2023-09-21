import java.util.Stack;

public class st12{
    public static class Stack {
        private int idx;
        int[] arr = new int[6];

        public void push(int x) {
            if (idx > 6) {
                System.out.println("Stack overflow");
            } else {
                arr[idx] = x;
                idx++;
            }
        }

        public int pop() {
            if (idx == 0) {
                System.out.println("Stack is empty...");
                return -1;
            } 
            else {
                int p=arr[idx-1];
                arr[idx-1]=0;
                idx--;
                return p;
            }
        }
        public int peek(){
            if(idx==0){
                System.out.println("Stack is empty....");
                return -1;
            }
            else{
                int p=arr[idx-1];
                return p;
            }
        }
        public void display(){
            for(int i=0;i<idx;i++){
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(5);
        st.push(10);
        st.push(15);
        st.push(20);
        st.display();
        st.pop();
        st.display();
        System.out.println(st.peek());
    }
}