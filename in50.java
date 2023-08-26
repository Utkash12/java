// import java.util.Scanner;
class Phone{
    public void greet(){
        System.out.println("Good Morning....");
    }
    public void name(){
        System.out.println("This is the first one....");
    }
    
}
class Smartphone extends Phone{
    public void swagat(){
        System.out.println("Swagat hai aapka....");
    }
    public void name(){
        System.out.println("This is the second one....");
        // super.name();
        // int b=sc.nextInt();
    }
}
public class in50 {
    public static void main(String[] args) {
        Phone obj=new Smartphone();
        //refernce of parent class and object of child class
        obj.name();
        obj.greet();
        // Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();
        
        // System.out.println(a);
        
    }
    
}
