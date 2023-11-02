import java.util.*;
public class hs31 {
    public static void main(String[] args){
        int[] arr={1,6,4,7,3,5,9,10,11,12,13,15,16};
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        System.out.println(hs);
    }
}