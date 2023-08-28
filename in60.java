class animal{
    void printing(){
        System.out.println("This is parent....");
    }
}
class dog extends animal{
    void printing(){
        System.out.println("This is child....");
        super.printing();
    }
}
public class in60{
    public static void main(String[] args){
        dog d1=new dog();
        d1.printing();
        // super.printing();
    }
}