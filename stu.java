public class stu{
    static void meth(int num,String... values){
        System.out.println("number is "+num);
        for(String s:values){
            System.out.println(s);
        }
    }
    public static void main(String[] args){
        meth(20,"hello","world");
        meth(50,"my","name","is","hello");
    }
}