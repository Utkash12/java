public class object{
    public static void main(String[] args){
        student rahul=new student();
        rahul.number=1;
        rahul.name="Rahul";
        rahul.marks=99.9f;
        System.out.println(rahul.marks);
    }
}
class student{
    int number;
    String name;
    float marks;
}