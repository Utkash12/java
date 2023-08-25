class one{
    void unique(){
        System.out.println("This is the first one....");
    }
}
class second extends one{
    void unique(){
        
        System.out.println("This is the second one....");
        super.unique();
    }
}
public class in44{
    public static void main(String[] args){
        second sec=new second();
        sec.unique();
        // one on=new one();
        // on.unique();
    }
}