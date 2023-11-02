import java.util.*;
public class hs32{
    public static void main(String[] args){
        int[] arr={1,2,3,4,6,7,8,9,10,23,34,35,36};
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        int currStreak=0;
        int maxStreak=0;
        for(int i=0;i<arr.length;i++){
            if(!hs.contains(arr[i]-1)){
                currStreak=1;
                int curr=arr[i];
                while(hs.contains(arr[i]+1)){
                    curr++;
                    currStreak++;
                }
                maxStreak=Math.max(currStreak,maxStreak);
            }
            
        }
        System.out.println(maxStreak);
    }
}