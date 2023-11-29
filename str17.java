//reverse each word
public class str17{
    public static void main(String[] args){
        String str="hi this is me";
        int first=0;
        int last=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                last=i-1;
                while(first<last){
                    char temp=str.charAt(first);
                    char f=str.charAt(first);
                    // str.charAt(first)=str.charAt(last);
                    f=str.charAt(last);
                    char l=str.charAt(last);
                    // str.charAt(last)=temp;
                    l=temp;
                    first++;
                    last--;
                }
                first=i+1;
            }
        }
        System.out.println(str);
    }
}