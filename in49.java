class parent{
    void paren(){
        System.out.println("This is the parent class....");
    }
}
class child extends parent{
    void chil(){
        System.out.println("This is the child class....");
    }
 
}
public class in49{
    public static void main(String[] args){
        parent obj=new child();
        obj.paren();
    }
}