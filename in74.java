abstract class bank{
    abstract float rate();
}
class sbi extends bank{
    public float rate(){
        return 7.5f;
    }
}
class icici extends bank{
    public float rate(){
        return 8.5f;
    }
}
class hdfc extends bank{
    public float rate(){
        return 9.5f;
    }
}
public class in74{
    public static void main(String[] args){
        bank s=new sbi();
        bank i=new icici();
        bank h=new hdfc();
        System.out.println("The rate of interest in sbi is: "+s.rate());
        System.out.println("The rate of interest in icici is: "+i.rate());
        System.out.println("The rate of interest in hdfc is: "+h.rate());
    }
}