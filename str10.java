public class str10 {
    public static void main(String[] args) {
        String str = "PhySiCS WAAllAH";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int asc = (int) ch;
            if(asc>=65 && asc<=90){
                asc+=32;
            }
            else if(asc>=97 && asc<=122){
                asc-=32;
            }
             char c=(char)asc;
            System.out.print(c);
        }
    }
}