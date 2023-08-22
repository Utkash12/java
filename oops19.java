
public class oops19{
        String name;
        int number;
        void setName(String n){
            this.name=n;
        }
       
        void setNumber(int n){
            this.number=n;
        }
        void display(){
        System.out.println(name+"  "+number);
        }
    public static void main(String[] args){
        oops19 s1=new oops19();
        s1.setName("Rahul");
        s1.setNumber(1234);
        s1.display();
    }
}
