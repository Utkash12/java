class shape{
    void draw(){
        System.out.println("Drawing....");
    }
}
class rectangle extends shape{
    void draw(){
        System.out.println("Drawing rectangle....");
    }
}
class circle extends shape{
    void draw(){
        System.out.println("Drawing circle....");
    }
}
public class in51{
    public static void main(String[] args){
        shape s=new shape();
        s.draw();
        shape s1=new rectangle();
        s1.draw();
        shape s2=new circle();
        s2.draw();
    }
}