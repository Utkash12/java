import java.util.*;
public class hm19{
    public boolean isIsomorphic(String s,String t){
        HashMap<Character,Character> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character sch=s.charAt(i);
            Character tch=t.charAt(i);
            if(mp.containsKey(sch)){
                if(mp.get(sch)!=tch)return false;
            }else if(mp.containsValue(tch)){
                return false;
            }else{
                mp.put(sch,tch);
            }

        }
        return true;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first string");
        String str1=sc.nextLine();
        System.out.println("enter the second string");
        String str2=sc.nextLine();
        hm19 obj=new hm19();
        System.out.println(obj.isIsomorphic(str1,str2));
    }
}