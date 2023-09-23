public class st17{
    public static class Stack{
        private int[] arr=new int[5];
        int idx=0;
        void push(int x){
            if(idx>5){
                System.out.println("Stack is overflow....");
            }
            else{
                arr[idx]=x;
                idx++;
            }
        }
        int pop(){
            if(idx==0){
                System.out.println("Stack is empty...");
                return -1;
            }
            else{
                int n=arr[idx];
                arr[idx]=0;
                idx--;
                return n;
            }
        }
        void display(){
            if(idx==0){
                System.out.println("Stack is empty...");
            }
            else{
                for(int i=0;i<idx;i++){
                    System.out.println(arr[i]);
                }
            }
        }
    }
    public static void main(String[] args){
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.display();
        System.out.println(st.pop());   
    }
}