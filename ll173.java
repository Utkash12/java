import java.util.Stack;
public class ll173{
    public static void main(String[] args){
        int[] arr={1,3,2,1,8,6,3,4};
        int[] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        st.push(arr[0]);
        ans[0]=-1;
        for(int i=1;i<arr.length;i++){
            while(st.size()>0 && arr[i]<=st.peek()){
                st.pop();
            }
            if(st.size()==0){
                ans[i]=-1;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(arr[i]);
        }
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}