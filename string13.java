public class string13{
    public static void main(String[] args){
        String str="This is a new string";
        String gtr="This is another string";
        System.out.println(str);
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
        System.out.println(str.substring(4,10));
        System.out.println(str.replace('i','a'));
        System.out.println(str.concat(" and this is another string"));
        System.out.println(str.charAt(3));
        System.out.println(str.indexOf('i'));
        System.out.println(str.compareTo(gtr));
        System.out.println(gtr.compareTo(str));
        System.out.println(str.contains("new"));
        System.out.println(str.equals(gtr));
        System.out.println(str.startsWith("This"));
        System.out.println(str.endsWith("string"));
        String s1="abcd";
        String s2=" efgh";
        System.out.println(s1.concat(s2));

    }
}