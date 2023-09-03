abstract class bike{
    abstract void run();
    void gear(){
        System.out.println("Changing gear....");
    }
    abstract void accelerate();
}
class hero extends bike{
    void run(){
        System.out.println("Hero bike is running....");
    }
    void accelerate(){
        System.out.println("Hero is running fastly....");
    }
}
class honda extends bike{
    void run(){
        System.out.println("Honda bike is running....");
    }
    void accelerate(){
        System.out.println("Honda is running slowly....");
    }
}
public class in73{
    public static void main(String[] args){
        bike he=new hero();
        bike ho=new honda();
        he.run();
        he.gear();
        he.accelerate();
        ho.run();
        ho.gear();
        ho.accelerate();
    }
}