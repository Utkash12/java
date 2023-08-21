class Employee{
    int salary;
    String name;
    
    public void setSalary(int sal){
        salary=sal;
    }
    public int getSalary(){
        return salary;
    }
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
}
public class oops17{
    public static void main(String[] args){
        Employee rahul=new Employee();
        rahul.setSalary(40000);
        rahul.setName("Rahul Singh");
        System.out.println(rahul.getName());
        System.out.println(rahul.getSalary());
    }
}