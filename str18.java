public class str18{
    public static void main(String[] args){
        String str="hi this is me";
        int first=0;
        int last=0;
        String s="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                last=i-1;
                while(first<last){
                    char temp=str.charAt(last);
                    System.out.println(temp);
                    // str.charAt(last)=str.charAt(first);
                    // str.charAt(first)=temp;
                    last--;
                }
                first=i+1;
            }
        }
        System.out.println(s);
    }
}