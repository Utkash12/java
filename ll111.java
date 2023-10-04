import java.util.Stack;
public class ll111 {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        int[] arr={1,2,2,2,3,3,4,4,5};
        for(int i=0;i<arr.length;i++){
            st.push(arr[i]);
        }
        // System.out.println(st);
        for(int i=0;i<arr.length;i++){
            if(st.size()==0 || st.peek()!=arr[i]){
                st.push(arr[i]);
            }
            else{
                
            }
        }
    }
}
