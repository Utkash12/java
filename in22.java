class animal{
    void eat(){
        System.out.println("Eating first....");
    }
}
class dog extends animal{
    void eat(){
        System.out.println("Eating second....");
    }
    void walk(){
        System.out.println("Walking....");
        super.eat();
        eat();
    }
}
public class in22{
    public static void main(String[] args){
        dog d1=new dog();
        d1.eat();
        d1.walk();

    }
}