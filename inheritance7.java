class animal{
    void primary(){
        System.out.println("These all are animals....");
    }
}
class dog extends animal{
    private String str;
    void setWork(String s){
        this.str=s;
    }
    void getWork(){
        System.out.println(str);
    }
}
class cat extends animal{
    private String str;
     void setWork(String s){
        this.str=s;
    }
    void getWork(){
        System.out.println(str);
    }
}
public class inheritance7{
    public static void main(String[] args){
        dog doggy=new dog();
        doggy.setWork("doggy is woking....");
        doggy.primary();
        doggy.getWork();
        cat catty=new cat();
        catty.primary();
        catty.setWork("catty is working....");
        catty.getWork();
        
    }
}