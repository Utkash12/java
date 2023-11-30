//reverse each word in a string
public class str21{
    static String reverse(String str){
        String ans="";
        for(int i=str.length()-1;i>=0;i--){
            ans=ans+str.charAt(i);
        }
        return ans;
    }
    public static void main(String[] args){
        String str="hi this is me";
        String ans="";
        int present=0;
        int next=0;
        while(next<str.length()){
            if(str.charAt(next)==' '){
                for(int i=next-1;i>=present;i--){
                    ans=ans+str.charAt(i);
                }
                ans=ans+" ";
                present=next+1;
                next++;
            }
            else{
                next++;
            }
        }
        for(int i=str.length()-1;i>=present;i--){
            ans=ans+str.charAt(i);
        }
        System.out.println(ans);
    }
}