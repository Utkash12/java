class employee{
    int sal=40000;
    String str="Rahul";
}
public class inheritance1 extends employee{
    int num=123;
    public static void main(String[] args){
        inheritance1 emp1=new inheritance1();
        System.out.println(emp1.sal);
        System.out.println(emp1.str);
        System.out.println(emp1.num);
    }
}