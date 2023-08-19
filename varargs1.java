public class varargs1{
    static void run(int num,String ... values){
        for(String s:values){
            System.out.println(s);
        }
    }
    public static void main(String[] args){
        run(10,"hello");
        run(10,"my","name","is","hello");
    }
}