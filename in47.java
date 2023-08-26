class grand{
    void gr(){
        System.out.println("This is the grand class....");
    }
}
class parent extends grand{
    void pr(){
        System.out.println("This is the parent class....");
    }
}
class child extends parent{
    void ch(){
        System.out.println("This is the child class....");
    }
}
public class in47{
    public static void main(String[] args){
        child c=new child();
        c.gr();
        c.pr();
        c.ch();
        grand g=new parent();
        g.gr();
        g.pr();
    }
}