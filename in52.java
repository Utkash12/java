import java.util.Random;
public class in52{
    int sal=8000;
    public static void main(String[] args){
        in52 obj=new in52();
        System.out.println(obj.sal);
        Random rand=new Random();
        int i=rand.nextInt(50);
        System.out.println(i);
    }
}