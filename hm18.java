//isomorphic strings    
import java.util.Scanner;
import java.util.HashMap;
public class hm18{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string to be checked: ");
        String str1=sc.nextLine();
        System.out.println("Enter the second string to be checked: ");
        String str2=sc.nextLine();
        HashMap<Character,Character> hm=new HashMap<>();
        for(int i=0;i<str1.length();i++){
            char ch1=str1.charAt(i);
            char ch2=str2.charAt(i);
            if(hm.containsKey(ch1)){
                if(hm.get(ch1)!=ch2){
                    System.out.println("false");
                    System.exit(0);
                }
                else{
                    continue;
                }
            }
            else if(!hm.containsKey(ch1)){
                if(hm.containsValue(ch2)){
                    System.out.println("false");
                    System.exit(0);
                }
                else{
                    hm.put(ch1,ch2);
                }
                
            }

    }
}
}

        //     if(!hm.containsKey(ch1)){
        //         hm.put(ch1,ch2);
        //     }
        //     else if(hm.containsKey(ch1)){
        //         if(hm.get(ch1)!=ch2){
        //             System.out.println("false");
        //             System.exit(0);
        //         }
        //         else{
        //             continue;
        //         }
        //     }
        // }
        // System.out.println("true");
