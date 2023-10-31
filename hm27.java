import java.util.Scanner;
import java.util.HashMap;
public class hm27{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> hm=new HashMap<>();
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the element: ");
            arr[i]=sc.nextInt();
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }
            else{
                hm.put(arr[i],hm.get(arr[i])+1);
            }
        }
        System.out.println(hm);
        // for(int i:hm.keySet()){
        //     if(hm.get(i)==1){
        //         System.out.println(i);
        //     }
        // }
    }
}