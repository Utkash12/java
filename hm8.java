import java.util.HashMap;
public class hm8{
    public static void main(String[] args){
        int[] arr={1,2,2,2,3,3,4,2,5,5,5,6,5,4,3,2,1,1};
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
        int max=0;
        int ans=0;
        for(int i:hm.keySet()){
            if(max<hm.get(i)){
                max=hm.get(i);
                ans=i;
            }
        }
        hm.putIfAbsent(1, 340);
        // for(var i:hm.entrySet()){
        //     if(max<hm.get(i)){
        //         max=hm.get(i);
        //         ans=i;
        //     }
        // }
        System.out.println(max);
        System.out.println(ans);
        
    }
}