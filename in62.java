class circle{
    public int radius;
    circle(){
        System.out.println("I'm not a parameterized constructor");
    }
    circle(int r){
        this.radius=r;
        System.out.println("I'm a parameterized constructor");
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class cylinder extends circle{
    public int height;
    cylinder(int r,int h){
        super(r);
        this.height=h;
        System.out.println("I'm a parameterized constructor");
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class in62 {
    public static void main(String[] args) {
        cylinder c1=new cylinder(5,10);
        System.out.println(c1.area());
        System.out.println(c1.volume());
    }
}
