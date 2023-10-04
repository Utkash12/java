import java.util.Stack;
public class ll108 {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        int[] arr={1,5,3,2,1,6,3,4};
        int[] res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            st.push(arr[i]);
        }
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
            while(st.peek()<arr[i] && st.size()>0){
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
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(res[i]+"  ");
        }
    }
}
