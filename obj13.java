class employee{
    int id;
    String name;
    void print(){
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
    }
}
public class obj13{
    public static void main(String[] args){
        employee harry=new employee();
        harry.id=12;
        harry.name="harry";
        harry.print();
    }
}