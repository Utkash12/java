class base{
    base(){
        System.out.println("This is the first base....");
    }
    base(int a){
        System.out.println("This is the second base...."+a);
    }
    base(int a,int b){
        System.out.println("This is the third base...."+a+" "+b);
    }
}
class derive extends base{
    // super(5,10);
    derive(){
        super(5,10);
        System.out.println("This is the derived class....");
    }
    derive(int a){
        System.out.println("This is the derived class...."+a);
    }

}
public class in2{
    public static void main(String[] args){
        
        // derive d1=new derive();
        derive d2=new derive(5);
        // super(5);
    }
}