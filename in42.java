class one{
    one(){
        System.out.println("This is the first one....");
    }
}
class two extends one{
    two(){
        super();
        System.out.println("This is the second one....");
        
    }
    public void two(){
        System.out.println("This is the third one....");
    }
}
public class in42{
    public static void main(String[] args){
        two t1=new two();
        t1.two();
    }
}