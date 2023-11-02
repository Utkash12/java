import java.util.*;
public class str103{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++){
            System.out.println("Enter the element: ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
            hs.add(arr[i]);
        }
        System.out.println(hs);
    }
    for(int i:hs){
        int maxStreak;
        if(!hs.contains(i-1)){
            // 
             int currStreak=1;
            int curr=i;
            while(hs.contains(i+1)){
                curr++;
                currStreak++;
            }
        }
        maxStreak=Math.max(currStreak,maxstreak);
    }
}