class bike{
    void run(){
        System.out.println("bike running...");
    }
}
class car{
    void run(){
        System.out.println("car running...");
    }
}
public class p31{
    public static void main(String[] args) {
        bike b=new bike();
        car c=new car();
        b.run();
        c.run();
    }
}