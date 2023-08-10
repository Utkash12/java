public class string14 {
    public static void main(String[] args){
        String x1="this is a string";
        String x2="this is a string";
        x2="this is another string";
        String y1="hi";
        y1="hello";
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(y1);
        System.out.println(y1.substring(0,2)+'y'+y1.substring(3));
        String z1="hello";
        String z2="hello";
        System.out.println(z1==z2);
        String z3=new String("hello");
        System.out.println(z1==z3);
        System.out.println(z1.equals(z3));
        System.out.println(x2.replace('i','j'));
    }
}
