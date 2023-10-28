import java.util.Scanner;
import java.util.HashMap;
public class hm15{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first string");
        String str1=sc.nextLine();
        System.out.println("enter the second string");
        String str2=sc.nextLine();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<str1.length();i++){
            if(!hm.containsKey(str1.charAt(i))){
                hm.put(str1.charAt(i),1);
            }
            else{
                hm.put(str1.charAt(i),hm.get(str1.charAt(i))+1);
            }
        }
        for(int i=0;i<str2.length();i++){
            if(!hm.containsKey(hm.get(str2.charAt(i)))){
                System.out.println("false");
                System.exit(0);
            }
            else{
                hm.put(str2.charAt(i),hm.get(str2.charAt(i))-1);
            }
        }
        for(int i=0;i<str1.length();i++){
            if(hm.get(str1.charAt(i))!=0){
                System.out.println("false");
                System.exit(0);
            }
            else{
                continue;
            }
        }
        System.out.println("true");
    }
}