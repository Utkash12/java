//reverse each word in a string
public class str21{
    public static void main(String[] args){
        String str="I am a bad boy";
        String ans="";
        int present=0;
        int last=0;
        while(last<str.length()){
            if(str.charAt(last)==' '){
                for(int i=last-1;i>=present;i--){
                    ans=ans+str.charAt(i);
                }
                ans=ans+" ";
                present=last+1;
                last++;
            }
            else{
                last++;
            }
        }
        for(int i=str.length()-1;i>=present;i--){
            ans=ans+str.charAt(i);
        }
    }
}