import java.util.Stack;
public class ll133 {
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        Stack<Integer> gt=new Stack<>();
        int[] arr={3,5,7,2,1,4,8};
        for(int i=0;i<arr.length;i++){
            if(st.size()==0){
                st.push(arr[i]);
                gt.push(arr[i]);
            }
            if(st.size()>0 && arr[i]<=st.peek()){
                st.push(arr[i]);
                gt.push(arr[i]);
            }
            else{
                st.push(arr[i]);
                gt.push(gt.peek());
            }
            // if(st.size()>0 && arr[i]>st.peek()){
            //     st.push(arr[i]);
            //     while(gt.size()>0 && gt.peek()<arr[i]){
            //         gt.pop();
            //     }
            //     if(gt.size()==0){
            //         System.out.println(arr[i]+" -> -1");
            //     }
            //     else{
            //         System.out.println(arr[i]+" -> "+gt.peek());
            //     }
            // }
        }
        while(st.size()>0){
            System.out.println(st.pop()+" -> "+gt.pop());
        }
        
    }
}
