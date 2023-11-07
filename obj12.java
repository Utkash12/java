 class Employee{
        int id;
        String name;
        public void print(){
            System.out.println(id+" "+name);
        }
    }
public class obj12{
    public static void main(String[] args) {
        Employee rahul=new Employee();
        rahul.id=1;
        rahul.name="Rahul";
        // System.out.println(rahul.id+" "+rahul.name);
        rahul.print();
    }
}