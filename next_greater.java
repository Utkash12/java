//next grater element
import java.util.Stack;
public class next_greater {
    public static void main(String[] args) {
        int[] arr={1,3,2,1,8,6,3,4};
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[arr.length];
        ans[arr.length-1]=-1;
        st.push(arr[arr.length-1]);
        for(int i=arr.length-2;i>=0;i--){
            while(st.size()>0 && arr[i]>=st.peek()){
                st.pop();
                // st.push(arr[i]);
            }
            if(st.size()==0){
                ans[i]=-1;
                // st.push(arr[i]);
            }
            else{
                ans[i]=st.peek();
                // st.push(arr[i]);
            }
            st.push(arr[i]);
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
