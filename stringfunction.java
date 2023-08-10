public class stringfunction{
    public static void main(String[] args){
        String str=new String("This is a new string.");
        System.out.println(str);


        System.out.println(str.charAt(5));


        System.out.println(str.codePointAt(5));


        System.out.println(str.codePointBefore(5));


        System.out.println(str.codePointCount(0,7));


        
    }
}