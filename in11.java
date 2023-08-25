class animal{
    animal(){
        System.out.println("This is the parent class....");
    }
}
class dog extends animal{
    dog(){
        System.out.println("This is the child class....");
    }
}
public class in11{
    public static void main(String[] args){
        dog d1=new dog();
    }
}