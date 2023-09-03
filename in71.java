class grandfather{
    void print(){
        System.out.println("This is the grandparent class....");
    }
}
class father extends grandfather{
    void print1(){
        System.out.println("This is the parent class....");
    }
}
class child1 extends father{
    void print11(){
        System.out.println("This is the first child class....");
    }
}
class child2 extends father{
    void parent12(){
        System.out.println("This is the second child class....");
    }
}
public class in71{
    public static void main(String[] args){
        grandfather grand=new grandfather();
        grand.print();
        father ther=new father();
        ther.print1();
        // ther.print();
        father ther1=new child1();
        ther1.print1();
        // ther1.print();
        child1 child=new child1();
        child.print11();
        child.print1();
        // child.print();
        father ther2=new child2();
        ther2.print1();
        // ther2.print();
        child2 child1=new child2();
        child1.parent12();
        child1.print1();
        // child1.print();
    }
}