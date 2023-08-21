class employee{
    String name;
    int phone;
    float marks;
    public void printing(){
        System.out.println("Marks of "+name+" will be "+marks+" and phone number will be "+phone);
    }
}
public class oops12{
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
        shiv.printing();
        rahul.printing();
        // System.out.println(shiv.name+" "+shiv.phone+" "+shiv.marks);
        // System.out.println(rahu.name+" "+rahul.phone+" "+rahul.marks);
    }
}