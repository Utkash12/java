import java.util.*;
public class hm23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array: ");
        HashMap<Integer,Integer> hm=new HashMap<>();
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }
            else{
                hm.put(arr[i],hm.get(arr[i])+1);
            }
        }
        for(int i=0;i<5;i++){
            if(hm.get(arr[i])>1){
                System.out.println(arr[i]);
                break;
            }
        }
        
    }
}
