//Next Greater element
import java.util.Stack;
public class ll132 {
    public static void main(String[] args) {
        int[] arr={1,5,3,2,1,6,3,4};
        int[] res=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        st.push(arr[arr.length-1]);
        res[arr.length-1]=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(st.size()>0 && arr[i]>=st.peek()){
                st.pop();
            }
            if(st.size()==0){
                res[i]=-1;
            }
            else{
                res[i]=st.peek();
            }
            st.push(arr[i]);
        }
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
}
