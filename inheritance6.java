
class animal{
    String str;
    void setString(String s){
        this.str=s;
    }
    String getString(){
        return str;
    }
}
class dog extends animal{
    
}
class cat extends animal{
    
}
public class inheritance6 {
    public static void main(String[] args){
        dog d=new dog();
        cat c=new cat();
        d.setString("Doggy....");
        c.setString("Catty....");
        System.out.println(d.getString());
        System.out.println(c.getString());
    }
}
