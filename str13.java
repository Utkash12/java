public class str13{
    public static void main(String[] args){
        String str="abcde";
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                System.out.print(str.charAt(j));
            }
            System.out.println(" ");
        }
    }
}