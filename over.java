public class over{
    static void aim(){
        System.out.println("Hello world");
    }
    static void aim(int a){
        System.out.println("hello "+a+" world");
    }
    static void aim(int a,int b){
        System.out.println("hello "+ a+" world");
    }
    static void aim(float a,float b){
        System.out.println("hello "+a+" world");
    }
    static void aim(float a){
        System.out.println("hello world "+a);
    }
    public static void main(String[] args){
        aim();
        aim(10);
        aim(10,20);
        aim(10.5f,20.5f);
        aim(10.5f);
    }
}