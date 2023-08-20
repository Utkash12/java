public class varargs4{
    static void stu(int... num){
        for(int i:num){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        stu(10,20,30,40);
    }
}