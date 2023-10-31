// partner=target-nums[i];
import java.util.*;
public class hm25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target: ");
        int target=sc.nextInt();
        int[] ans={-1};
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            int partner=target-arr[i];
            if(mp.containsKey(partner)){
                // ans=new int[]{i,mp.get(partner)};
                // System.out.println(Arrays.toString(ans));
                // return;
                // ans[0]=i;
                // ans[1]=mp.get(partner);
                // System.out.println(Arrays.toString(ans));
                // return;
            }
        }
    }
}
