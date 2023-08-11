public class string25 {
    public static void main(String[] args){


        // StringBuilder



        StringBuilder str=new StringBuilder("hello");
        System.out.println(str);
        str.setCharAt(0,'j');
        System.out.println(str);
        str.deleteCharAt(3);
        System.out.println(str);


        str.insert(3,'l');
        System.out.println(str);
        str.delete(0,3);
        System.out.println(str);


        String str2=str.toString();
        System.out.println("This is str2 "+str2);



        StringBuilder str3=new StringBuilder("hello");
        str3.deleteCharAt(0);
        System.out.println("delete charat"+str3);

        str3.append("hello");
        System.out.println("append    "+str3);
        str3.reverse();
        System.out.println("reverse   "+str3);
        str3.setCharAt(3,'f');
        System.out.println("set charat         "+str3);


        // String 


        String str1="hello";
        // str1.deleteCharAt(0);
        System.out.println(str1);


        // str1.deleteCharAt(0);

    }
}
