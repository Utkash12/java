public class str4{
    public static void main(String[] args){
        String str="abdek dfger";
        String str1="abdek dfger";  
        System.out.println(str.contains("a"));
        System.out.println(str.concat(str1));
        str=str.concat(str1);
        System.out.println(str);

    }
}