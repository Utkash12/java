public class student{
    int roll;
    String name;
    float marks;
    public static void main(String args[]){
        student s1=new student();
        student s2=new student();
        s1.roll=202010002;
        s1.name="Rahul";
        s1.marks=99.9f;
        s2.roll=202010003;
        s2.name="Rohit";
        s2.marks=99.8f;
        System.out.println(s1.roll+" "+s1.name+" "+s1.marks);
        System.out.println(s2.roll+" "+s2.name+" "+s2.marks);
    }
}