class student{
    int num;
    String name;
    public void setNum(int n){
        this.num=n;
    }
    public int getNum(){
        return num;
    }
    public void setName(String na){
        this.name=na;
    }
    public String getName(){
        return name;
    }
    public void setStudent(int n,String na){
        setNum(n);
        setName(na);
    }
    public void getStudent(){
        System.out.println(getNum());
        System.out.println(getName());
    }
}
public class oops21{
    public static void main(String args[]){
        student s1=new student();
        s1.setNum(98);
        System.out.println(s1.getNum());
        s1.setName("Rahul");
        System.out.println(s1.getName());
        student s2=new student();
        s2.setNum(50);
        System.out.println(s2.getNum());
        s2.setName("Akash");
        System.out.println(s2.getName());


        
        student s3=new student();
        s3.setStudent(100,"Rohit");
        s3.getStudent();

        
    }
}