import java.util.*;
public class arr27{
    public static void main(String[] args){
        int[] arr={1,7,5,3,9,10};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                arr[i]=-1;
            }
        }
        int max2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max2){
                max2=arr[i];
            }
        }
        System.out.println(max2);
        // System.out.println(max);
    }
}