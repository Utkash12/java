class animal{
    animal(){
        System.out.println("THis is the primary class....");
    }
}
class dog extends animal{
    dog(){
        System.out.println("This is the secondary class....");
    }
}
public class in1{
    public static void main(String[] args){
        dog d1=new dog();
    }
}