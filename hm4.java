import java.util.HashMap;
// import java.util.Map;
public class hm4{
    public static void main(String[] args){
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"ankur");
        hm.put(2,"aryan");
        hm.put(3,"ayush");
        hm.put(4,"ankit");
        System.out.println("Values: "+ hm.values());
        System.out.println("Keys: "+hm.keySet());
        hm.putIfAbsent(5,"Ashutosh");
        System.out.println(hm);
        System.out.println(hm.get(2));
        System.out.println(hm.containsKey(1));
        System.out.println(hm.containsValue("ankit"));
        for(HashMap.Entry<Integer,String> h:hm.entrySet()){
            System.out.println(h.getKey()+"    "+h.getValue());
        }
        for(int x:hm.keySet()){
            System.out.println(x);
        }
    }
}