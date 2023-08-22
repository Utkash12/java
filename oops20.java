class student{
    int num;
    String name;
    void setNum(int number){
        this.num=number;
    }
    int getNum(){
        return num;
    }
    void setName(String fullname){
        this.name=fullname;
    }
    String getName(){
        return name;
    }
}
public class oops20{
    public static void main(String[] args){
        student s1=new student("Rahul",1234);
        System.out.println(s1);
    }
}