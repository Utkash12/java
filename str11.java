public class str11{
    public static void main(String[] args){
        String str="abcdcba";
        int first=0;
        int flag=0;
        int last=str.length()-1;
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
        if(flag==0){
            System.out.println("String is pallindrome..");
        }
        else{
            System.out.println("String is not pallindrome");
        }
    }
}