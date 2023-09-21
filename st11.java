public class st11{
    public static class Stack{
        private int idx=0;
        int[] arr=new int[5];
        
        int push(int x){
            arr[idx]=x;
            idx++;
            return x;
        }
        
        
        int pop(){
            if(idx==0){
                System.out.println("Stack is empty...");
                return -1;
            }
            else{
                int x=arr[idx-1];
                arr[idx-1]=0;
                idx--;
                return x;
            }
        }
        
        int peek(){
            if(idx==0){
                System.out.println("Stack is empty...");
                return -1;
            }
            else{
                int x=arr[idx-1];
                return x;
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
    }
}