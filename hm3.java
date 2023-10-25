import java.util.Map;
import java.util.HashMap;
public class hm3 {
    public static void main(String[] args) {
        Map<String,Integer> hm=new HashMap<>();
        hm.put("India",135);
        hm.put("China",200);
        hm.put("Pak",30);
        hm.put("US",20);
        hm.put("UK",10);
        hm.put("Nepal",2);
        hm.put("India",140);
        System.out.println(hm);
        System.out.println(hm.get("India"));
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.get(125));
        System.out.println(hm.values());
        System.out.println(hm.keySet());
        hm.put("China",210);
        System.out.println(hm.containsKey("China"));
        System.out.println(hm.containsValue(210));
        System.out.println(hm.containsKey(hm.get("India")));
        System.out.println(hm.get("India"));
        System.out.println(hm.get(hm.get("India")));
        System.out.println(hm.get(135));
        System.out.println(hm.containsKey("UK"));
        hm.putIfAbsent("Russia",1111);
        System.out.println(hm.values());
        System.out.println(hm.entrySet());
        System.out.println(hm.remove("India"));
        System.out.println(hm);
        for(int x: hm.values()){
            System.out.println(x);
        }
        for(String x: hm.keySet()){
            System.out.println(x);
        }
        for(Map.Entry<String,Integer> x: hm.entrySet()){
            System.out.println(x);
        }
        for(String y: hm.keySet()){ 
            System.out.println(y+" "+hm.get(y));
        }
        for(Map.Entry<String,Integer> x: hm.entrySet()){
            System.out.println(x.getKey()+" "+x.getValue());
        }
        for (Map.Entry<String, Integer> x : hm.entrySet()) {
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
