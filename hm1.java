import java.util.HashMap;
public class hm1{
    public static void main(String[] args){
        HashMap<Integer,String> hh=new HashMap<>();
        hh.put(1, "anurag");
        hh.put(2,"abhishek");
        hh.put(3,"ayush");
        System.out.println(hh);
        System.out.println(hh.containsKey(1));
        System.out.println(hh.containsValue("anurag"));
        
        System.out.println(hh.get(1));
        HashMap<Integer,Integer> hs=new HashMap<>();
        hs.put(1,3);
        hs.put(2,4);
        hs.put(3,5);
        System.out.println(hs);
    }
}