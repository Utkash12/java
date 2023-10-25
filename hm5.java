import java.util.HashMap;
public class hm5 {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,5,1,4,4,6,4,4,4,6,2,2};
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int el: arr){
            if(!freq.containsKey(el)){
                freq.put(el,1);
            }
            else{
                freq.put(el,freq.get(el)+1);
            }
        }
        System.out.println(freq);
        
    }
}
