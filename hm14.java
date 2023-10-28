import java.util.Scanner;
import java.util.HashMap;
public class hm14{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first string");
        String str1=sc.nextLine();
        System.out.println("enter the second string");
        String str2=sc.nextLine();
        HashMap<Character,Integer> hm1=new HashMap<>();
        HashMap<Character,Integer> hm2=new HashMap<>();
        for(int i=0;i<str1.length();i++){
            if(!hm1.containsKey(str1.charAt(i))){
                hm1.put(str1.charAt(i),1);
            }
            else{
                hm1.put(str1.charAt(i),hm1.get(str1.charAt(i))+1);
            }
        }
        for(int i=0;i<str2.length();i++){
            if(!hm2.containsKey(str2.charAt(i))){
                hm2.put(str2.charAt(i),1);
            }
            else{
                hm2.put(str2.charAt(i),hm2.get(str2.charAt(i))+1);
            }
        }
        if(hm1.equals(hm2)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}