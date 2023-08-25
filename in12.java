class animal{
    animal(){
        System.out.println("This is the parent class....");
    }
    animal(int a){
        System.out.println("This is the secondary parent class...."+ a);
    }
}
class dog extends animal{
    dog(){
        System.out.println("This is the child class....");
    }
}
public class in12{
    public static void main(String[] args){
        
        dog d1=new dog();
    }
}