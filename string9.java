public class string9{
    public static void main(String[] args){
        String str="hi this is a string";
        String gtr="hi this is another string";

        System.out.println(str.length());


        System.out.println(str.substring(4));


        System.out.println(str.substring(4,8));


        System.out.println(str.replace('i','a'));


        System.out.println(str.toUpperCase());


        System.out.println(str.toLowerCase());


        System.out.println(str.trim());


        System.out.println(str.concat(" and this is another string"));


        System.out.println(str.charAt(4));


        System.out.println(str.indexOf('i'));


        System.out.println(str.compareTo(gtr));


        System.out.println(gtr.compareTo(str));


        System.out.println(str.contains("this"));


        System.out.println(str.equals(gtr));

        System.out.println(str.startsWith("hi this"));

        System.out.println(str.endsWith("string"));



        String s1="abcd";
        String s2=" efgh";
        System.out.println(s1.concat(s2));
    }
}