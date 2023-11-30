//remove duplicates from a string
public class str22{
    public static void main(String[] args){
        String str="abdhdbasesddsd";
        String ans="";
        for(int i=0;i<str.length();i++){
            if(ans.contains(str.charAt(i)+"")){
                i++;
            }
            else{
                ans=ans+str.charAt(i);
            }
        }
        System.out.println(ans);
    }
}