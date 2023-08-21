class phone{
    public void ring(){
        System.out.println("phone is ringing...");
    }
    public void call(){
        System.out.println("phone is calling...");
    }
    public void text(){
        System.out.println("phone is texting...");
    }
}
public class oops14{
    public static void main(String[] args){
        phone samsung=new phone();
        samsung.ring();
        samsung.call();
        samsung.text();
        phone asus=new phone();
        asus.ring();
        asus.call();
        asus.text();
    }
}