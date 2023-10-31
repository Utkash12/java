import java.util.HashMap;
public class hm26{
    public static void main(String[] args){
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(1,100);
        hm.put(2,200);
        hm.put(3,300);
        hm.put(4,400);
        hm.put(1,500);
        hm.put(1,600);
        System.out.println(hm);
        
    }
}