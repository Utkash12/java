class animal{
    void first(){
        System.out.println("This is the first one....");
    }
}
class animal1 extends animal{
    void first(){
        super.first();
        System.out.println("this is the second one....");
    }
}
class animal12 extends animal1{
    void first(){
        super.first();
        // first();
        System.out.println("this is the third one....");
    }
}
public class in24{
    public static void main(String[] args){
        animal12 an=new animal12();
        an.first();
    }
}