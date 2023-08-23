
class cylinder{
    private float height;
    private float radius;
    public void setHeight(float hei){
        this.height=hei;
    }
    public void getHeight(){
        System.out.println("The height of the cylinder will be: "+ height);
    }
    public void setRadius(float ra){
        this.radius=ra;
    }
    public void getRadius(){
        System.out.println("The radius of the cylinder will be "+radius);
    }
    public void volume(){
        System.out.println(Math.PI* radius*radius*height);
    }
    public void surfaceArea(){
        System.out.println(2*Math.PI*radius*height);
    }
}
public class oops24{
    public static void main(String[] args){
        cylinder c1=new cylinder();
        c1.setHeight(10.04f);
        c1.setRadius(4.56f);
        c1.getHeight();
        c1.getRadius();
        c1.volume();
        c1.surfaceArea();
        cylinder c2=new cylinder();
        c2.setHeight(12.04f);
        c2.setRadius(5.56f);
        c2.getHeight();
        c2.getRadius();
        c2.volume();
        c2.surfaceArea();
    }
}