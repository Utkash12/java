import java.util.HashMap;
public class hm6{
    public static void main(String[] args){
        int[] arr={1,2,2,2,3,3,4,5,5,6,6,4,3,2,2,3,1};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:arr){
            if(!hm.containsKey(i)){
                hm.put(i,1);
            }
            else{
                hm.put(i,hm.get(i)+1);
            }
        }
        System.out.println(hm);
        System.out.println(hm.entrySet());
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        int max=0;
        int ans=0;
        for (int i : hm.keySet()) {
            if (max < hm.get(i)) {
                max = hm.get(i);
                ans = i;
            } else {
                continue;
            }
        }
        System.out.println("The maximum frequency is of "+ans);

    }
    
}