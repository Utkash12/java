import java.util.*;
public class arr22{
    public static void main(String[] args){
        int[] arr={1,23,34,45,6,67,78,89,90};
        int flag=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<=arr[i+1]){
                flag=0;
            }
            else{
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Array is sorted.");
        }
        else{
            System.out.println("Array is unsorted.");
        }
    }
}