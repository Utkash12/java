//swap two numbers
public class arr33{
    public static void main(String[] args){
        int a=10;
        int b=20;
        if(a>b){
            a=a+b;
            b=a-b;
            a=a-b;
        }
        else{
            b=b+a;
            a=b-a;
            b=b-a;
        }
        System.out.println(a+" "+b);
    }
}