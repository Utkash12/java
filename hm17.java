import java.util.Scanner;
import java.util.HashMap;
public class hm17{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first String: ");
        String str1=sc.nextLine();
        System.out.println("Enter the second string: ");
        String str2=sc.nextLine();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<str1.length();i++){
            if(!hm.containsKey(str1.charAt(i))){
                hm.put(str1.charAt(i),1);
            }
            else{
                hm.put(str1.charAt(i),hm.get(str1.charAt(i)));
            }
        }
        for(int i=0;i<str2.length();i++){
            if(!hm.containsKey(str2.charAt(i))){
                System.out.println("It's not an anagram");
            }
            else{
                hm.put(str2.charAt(i),hm.get(str2.charAt(i))-1);
            }
        }
        for (int i : hm.values()) {
            if (i != 0) {
                System.out.println("it is not an anagram");
                System.exit(0);
            } else {
                continue;
            }
        }
        System.out.println("it is an anagram");
    }
}