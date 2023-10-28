import java.util.Scanner;
import java.util.HashMap;
public class hm13{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(!hm.containsKey(str.charAt(i))){
                hm.put(str.charAt(i),1);
            }
            else{
                hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
            }
        }
        System.out.println(hm);
    }
}