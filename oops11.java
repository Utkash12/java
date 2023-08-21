class employee{
    String name;
    int phone;
    float marks;
}
public class oops11{
    public static void main(String[] args){
        System.out.println("This is a custom class.");
        employee rahul=new employee();
        rahul.name="Rahul Kushwaha";
        rahul.phone=0522;
        rahul.marks=78.89f;
        employee shiv=new employee();
        shiv.name="Shiv Mishra";
        shiv.phone=7890;
        shiv.marks=56.78f;
        System.out.println(shiv.name+" "+shiv.phone+" "+shiv.marks);
        System.out.println(rahul.name+" "+rahul.phone+" "+rahul.marks);
    }
}