public class str6 {
    public static void main(String[] args){
        String str="abcdefgh";
        int first=0;
        int last=str.length()-1;
        while(first<last){
            char temp=str.charAt(first);
            str=str.substring(0,first)+str.charAt(last)+str.substring(first+1,last)+temp+str.substring(last+1);
            first++;
            last--;
        }
        System.out.println(str);
    }
}
