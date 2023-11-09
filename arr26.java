import java.util.*;
public class arr26{
    public static void main(String[] args){
        int[] arr={1,7,5,3,9,10,2};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}