import java.util.HashMap;
import java.util.Scanner;
public class hm12{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        HashMap<Character,Integer> hm=new HashMap<>();
        String str=sc.nextLine();
        // int val=0;
        for(int i=0;i<str.length();i++){
            if(!hm.containsKey(str.charAt(i))){
                hm.put(str.charAt(i),1);
            }else{
                // val=hm.get(str.charAt(i));
                hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
            }
        }
        System.out.println(hm);

    }
}