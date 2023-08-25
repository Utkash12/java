class animal{
    void barks(){
        System.out.println("Barks....");
    }
    void eats(){
        System.out.println("Eats.....");
    }
    void thinks(){
        System.out.println("Thinks....");
    }
}
public class inheritance4 extends animal{
    void runs(){
        System.out.println("Runs....");
    }
    // void thinks(){
    //     System.out.println("Th...");
    // }
    public static void main(String[] args){
        inheritance4 dog=new inheritance4();
        dog.barks();
        dog.eats();
        dog.thinks();
        dog.runs();
    }
}