class vehicle{
    void parent(){
        System.out.println("This is a parent class....");
    }
}
class car extends vehicle{
    void child(){
        System.out.println("This is a child first class....");
    }
}
class bike extends vehicle{
    void child(){
        System.out.println("This is the child second class....");
    }
}
public class in46{
    public static void main(String[] args){
        car c1=new car();
        c1.parent();
        c1.child();
        bike b1=new bike();
        b1.parent();
        b1.child();
    }
}