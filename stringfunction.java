public class stringfunction{
    public static void main(String[] args){
        String str=new String("This is a new string.");
        String str1=new String("This IS AN Another string.");
        System.out.println(str);


        System.out.println(str.charAt(5));


        System.out.println(str.codePointAt(5));


        System.out.println(str.codePointBefore(5));


        System.out.println(str.codePointCount(0,14));


        System.out.println(str.compareTo(str1));


        System.out.println(str.compareToIgnoreCase(str1));


        System.out.println(str.concat(str1));


        System.out.println(str.contains("is"));

        
    }
}