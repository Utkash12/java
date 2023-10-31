import java.util.HashSet;
import java.util.Scanner;
public class str102{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++){
            System.out.println("Enter the element: ");
            arr[i]=sc.nextInt();
            hs.add(arr[i]);
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println(hs);
        int maxstreak=0;   
        for(int i:hs){
            if(!hs.contains(i-1)){
                int curr=i;
                int currstreak=1;
                while(hs.contains(curr+1)){
                    curr++;
                    currstreak++;
                }
                maxstreak=Math.max(maxstreak,currstreak);
            }

        }
        System.out.println(maxstreak);
    }
}