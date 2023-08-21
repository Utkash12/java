class MyEmployee{
    private int id;
    private String name;

    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }
}
public class oops16 {
    public static void main(String[] args) {
        MyEmployee e=new MyEmployee();
        e.setName("Harry");
        e.setId(34);
        System.out.println(e.getName());
        System.out.println(e.getId());
    }
    
}
