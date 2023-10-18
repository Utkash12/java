import java.util.*;
public class minstack {
    public static void main(String[] args) {
        int[] arr={3,4,5,2,67,8,1};
        Stack<Integer> st=new Stack<>();
        Stack<Integer> min=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(st.size()==0){
                st.push(arr[i]);
                min.push(arr[i]);
            }
            else if(st.size()>0 && arr[i]<min.peek()){
                st.push(arr[i]);
                min.push(arr[i]);
            }
            else if(st.size()>0 && arr[i]>=min.peek()){
                st.push(arr[i]);
            }
        }
        System.out.println(st);
        System.out.println(min);
    }
}
