
//next greater element using stack
import java.util.Stack;
public class s23{
    public static void greater(int[] arr){
        int n=arr.length;
        int[] res=new int[n];
        Stack<Integer> st=new Stack<>();
        res[n-1]=-1;
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            if(st.peek()>arr[i]){
                res[i]=st.peek();
            }
            else{
                while(st.size()>0 && st.peek()<arr[i]){
                    st.pop();
                }
                if(st.size()==0){
                    res[i]=-1;
                }
                else{
                    res[i]=st.peek();
                }
            }
            st.push(arr[i]);
        }
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr={1,3,2,5,6,4,2,7,3};
        greater(arr);
    }
}