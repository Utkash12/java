public class str9{
    public static void main(String[] args){
        String str="abcdasdesawsedasedwqa";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'){
                i++;
            }
            else{
                System.out.print(str.charAt(i));
            }
        }
    }
}