class animal{
    String str;
    void setString(String s){
        this.str=s;
    }
    String getString(){
        return str;
    }
}
public class inheritance5 extends animal{
    public static void main(String[] args){
        inheritance5 dog=new inheritance5();
        dog.setString("Doggy.....");
        System.out.println(dog.getString());
    }
}