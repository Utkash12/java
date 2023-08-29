class shape{
    int radius;
    shape(){
        System.out.println("I'm not a parametrized constructor....");
    }
    shape(int r){
        this.radius=r;
    }
}
class cylinder extends shape{
    int height;
    // super(r);
    cylinder(int h){
        super();
        System.out.println("I'm a parametrized constructor....");
        this.height=h;  
    }
      
}
public class in63{
    public static void main(String[] args){
        cylinder c1=new cylinder(10);
        // System.out.println(c1.radius);
        System.out.println(c1.height);
    }
}