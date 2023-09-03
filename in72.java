class shape{
    void drawing(){
        System.out.println("Drawing shape....");
    }
}
class rectangle extends shape{
    void drawing(){
        System.out.println("Drawing rectangle....");
    }
}
class triangle extends shape{
    void drawing(){
        System.out.println("Drawing triangle....");
    }
}
public class in72{
    public static void main(String[] args){
        shape rect=new rectangle();
        rect.drawing();
        shape tri=new triangle();
        tri.drawing();
    }
}