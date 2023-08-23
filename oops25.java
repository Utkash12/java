class cylinder{
    private float radius;
    private float height;
    public cylinder(float r,float h){
        this.radius=r;
        this.height=h;
    }
    public void display(){
        System.out.println(radius+"     "+height);
        System.out.println(3.14*radius*radius*height);
        System.out.println((2*3.14*radius*height)+(2*3.14*radius*radius));
    }
}
public class oops25{
    public static void main(String[] args){
        cylinder c1=new cylinder(23.45f,34.56f);
        c1.display();
        
    }
}