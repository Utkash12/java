import java.util.Stack;
public class ll171{
    public static void main(String[] args){
        int[] arr={5,2,4,6,3,5};
        int[] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        ans[arr.length-1]=-1;
        st.push(arr[arr.length-1]);
        for(int i=arr.length-2;i>=0;i--){
            while(st.size()>0 && st.peek()>arr[i]){
                st.pop();
            }
            if(st.size()==0){
                ans[i]=-1;
            } else{
                ans[i]=st.peek();
            }
            st.push(arr[i]);
        }
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}