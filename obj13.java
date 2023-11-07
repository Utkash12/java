class employee{
    int id;
    String name;
    int salary=12000;
    public void print(){
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
    }
    public int getid(){
        return id;
    }
}
public class obj13 extends employee{
    public static void main(String[] args){
        employee harry=new employee();
        harry.id=12;
        harry.name="harry";
        System.out.println(harry.getid());
        System.out.println(harry.salary);
        harry.print();
    }
}