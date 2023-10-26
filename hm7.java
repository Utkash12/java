import java.util.HashMap;
public class hm7{
    public static void main(String[] args){
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(1,10);
        hm.put(2,20);
        hm.put(3,30);
        hm.put(4,40);
        hm.put(5,50);
        for(int i:hm.keySet()){
            System.out.println(hm.get(i));
        }
        System.out.println(hm.get(4));
        int max=0;
        int ans=0;
        for(int i:hm.keySet()){
            if(max<hm.get(i)){
                max=hm.get(i);
                ans=i;
            }
            else{
                continue;
            }
        }
        System.out.println(ans);
        // System.out.println(hm.containsKey(3));
    }
}