class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}
public class oops13 {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.setName("Harry");
        e.salary=100000;
        System.out.println(e.getSalary());
        System.out.println(e.getName());
    }
}