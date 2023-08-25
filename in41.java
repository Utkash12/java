class one{
    String str="first....";
    void display(){
        System.out.println(str);
    }
}
class two extends one{
    String str="second....";
    void display(){
        System.out.println(str);
        System.out.println(super.str);
    }
}
public class in41{
    public static void main(String[] args){
        two t1=new two();
        t1.display();
    }
}