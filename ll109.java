import java.util.Stack;
public class ll109 {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<Integer>();
        int[] arr={1,2,3,4,5,6,7};
        for(int i=0;i<arr.length;i++){
            st.push(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        System.out.println(st);
    }
}
