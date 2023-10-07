import java.util.Stack;
public class ll119 {
    public static void main(String[] main){
        Stack<Integer> st=new Stack<>();
        int[] arr={1,2,3,3,3,4,4,5,6,6,7,8,9,10,11};
        for(int i=0;i<arr.length;i++){
            if(st.size()==0 || st.peek()!=arr[i]){
                st.push(arr[i]);
            }
            if(st.peek()==arr[i]){
                // if(arr[i]==arr[i+1]){
                //     arr[i]=arr[i+1];
                // }
                if(i==arr.length-1 || arr[i]!=arr[i+1]){
                    st.pop();
                }
            }
        }
        int res[]=new int[st.size()];
        Stack<Integer> rt=new Stack<>();
        for(int i=0;i<st.size();i++){
            res[i]=st.pop();
        }
        for(int i=0;i<st.size();i++){
            System.out.println(res[i]);
        }
    }
}
