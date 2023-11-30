public class str20{
    public static void main(String[] args){
        String str="aaaaabbbbccddddd";
        String ans="a";
        int count=1;
        int present=0;
        int next=1;
        // if(str.charAt(present)==str.charAt(next)){
        //     count++;
        //     ans=ans+count;
        //     present++;
        //     next++;
        // }
        // else{
        //     ans=ans+count;
        //     present++;
        //     next++;
        // }
        while(next<str.length()){
            if(str.charAt(present)==str.charAt(next)){
                count++;
                present++;
                next++;
            }
            else{
                ans=ans+count+str.charAt(next);
                count=1;
                present++;
                next++;
            }
        }
        System.out.println(ans);
    }
}