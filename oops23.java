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
}
public class oops23{
    public static void main(String[] args){
        cylinder c1=new cylinder();
        c1.setHeight(10.04f);
        c1.setRadius(4.56f);
        c1.getHeight();
        c1.getRadius();
    }
}