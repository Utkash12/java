public class str6 {
    public static void main(String[] args){
        String str="abcdefgh";
        int first=0;
        int last=str.length()-1;
        while(first<last){
            char temp=str.charAt(first);
            str.charAt(first)=str.charAt(last);
            str.charAt(last)=temp;
            first++;
            last--;
        }
        System.out.println(str);
    }
}
