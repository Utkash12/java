import java.util.HashMap;
import java.util.Scanner;
public class hm21{
    public static void main(String[] args){
        HashMap<Character,Character> hm=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1=sc.nextLine();
        System.out.println("Enter the second string: ");
        String str2=sc.nextLine();
        for(int i=0;i<str1.length();i++){
            char ch1=str1.charAt(i);
            char ch2=str2.charAt(i);
            if(hm.containsKey(ch1)){
                if(hm.get(ch1)!=ch2){
                    System.out.println("false");
                }
            }
            else if(hm.containsValue(ch2)){
                System.out.println("false");
            }
            else{
                hm.put(ch1,ch2);
            }
        }
        System.out.println("true");
    }
}