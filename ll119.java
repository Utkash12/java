import java.util.Stack;
public class ll119 {
    public static void main(String[] main){
        Stack<Integer> st=new Stack<>();
        int[] arr={1,2,3,3,3,4,4,5,6,6,7,8,9};
        for(int i=0;i<arr.length;i++){
            if(st.size()==0 || st.peek()!=arr[i]){
                st.push(arr[i]);
            }
            else if(st.peek()==arr[i]){
                if(arr[i]==arr[i+1]){
                    arr[i]=arr[i+1];
                }
                else{
                    
                }
            }
        }
    }
}
