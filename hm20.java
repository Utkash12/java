import java.util.Scanner;
import java.util.HashMap;
public class hm20{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string:  ");
        String str1=sc.nextLine();
        System.out.println("Enter the second string:  ");
        String str2=sc.nextLine();
        HashMap<Character,Character> hm=new HashMap<>();
        for(int i=0;i<str1.length();i++){
            if(!hm.containsKey(str1.charAt(i))){
                hm.put(str1.charAt(i),str2.charAt(i));
            }
            else if(hm.get(str1.charAt(i))!=str2.charAt(i)){
                System.out.println("false");
                System.exit(0);
            }
            else if(hm.containsValue(str2.charAt(i))){
                System.out.println("false");
                System.exit(0);
            }
            else{
                hm.put(str1.charAt(i),str2.charAt(i));
            }
        }
        System.out.println("true");

    }
}