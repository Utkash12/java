public class string7{
    public static void main(String[] args){
        String str1="            hi          ";
        System.out.println(str1.trim());
        String str2="This is an example of extracting some part of the string";
        System.out.println(str2.substring(4,46));
        System.out.println(str2.replace('a','i'));
        String str3="This is a string";
        System.out.println(str3.indexOf('i'));
        System.out.println(str3.startsWith("This"));
        System.out.println(str3.endsWith("string"));
    }
}