import java.util.*;
public class hs31 {
    public static void main(String[] args){
        int[] arr={1,6,4,7,3,5,9,10,11,12,13,14,15,16};
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        System.out.println(hs);
        int currStreak;
        int maxStresk=0;
        for(int i=0;i<arr.length;i++){
            if(!hs.contains(arr[i]-1)){
                currStreak=1;
                int curr=arr[i];
                while(hs.contains(curr+1)){
                    curr++;
                    currStreak++;
                }
                maxStresk=Math.max(maxStresk,currStreak);
            }
        }
        System.out.println(maxStresk);
    }
}