class student{
    int roll;
    String name;
    student(int r,String n){
        roll=r;
        name=n;
    }
    void display(){
        System.out.println(roll+"     "+name);
    }
}
public class son{
    public static void main(String[] args){
        student s1=new student(2020,"Aryan");
        student s2=new student(2021,"Ankit");
        s1.display();
        s2.display();
    }
}