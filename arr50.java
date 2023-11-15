import java.util.*;
public class arr50 {
    public static void main(String[] args){
        int[] arr={-10,-3,-1,2,4,7};
        int left=0;
        int right=arr.length-1;
        int k=0;
        int n=arr.length;
        int[] ans=new int[n];
        while(left<right){
            if(Math.abs(arr[left])> Math.abs(arr[right])){
                ans[k++]=arr[left]*arr[left];
                left++;
            }
            else{
                ans[k++]=arr[right]*arr[right];
                right--;
            }
            }
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+"  ");
        }  
    }
}