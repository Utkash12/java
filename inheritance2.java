class animal{
    void barks(){
        System.out.println("barking...");
    }
    void eat(){
        System.out.println("eats...");
    }
}
public class inheritance2 extends animal{
    void walks(){
            System.out.println("walking...");
        }
    public static void main(String[] args){
        
        inheritance2 dog=new inheritance2();
        dog.barks();
        dog.eat();
        dog.walks();
    }
}