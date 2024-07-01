interface draw{
    void drawing();
}
interface print{
    void printing();
}
public class p211 implements draw,print{
    public void drawing(){
        System.out.println("Drawing...");
    }
    public void printing(){
        System.out.println("Printing...");
    }
    public static void main(String[] args){
        p211 p=new p211();
        p.drawing();
        p.printing();
    }
}