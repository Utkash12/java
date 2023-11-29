//pallindrome string
public class str12{
    public static void main(String[] args){
        String str="abcdcba";
        int first=0;
        int last=str.length()-1;
        int flag=0;
        while(first<last){
            if(str.charAt(first)==str.charAt(last)){
                flag=0;
            }
            else{
                flag=1;
                break;
            }
            first++;
            last--;
        }
    }
}