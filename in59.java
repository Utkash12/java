class small{
    String color="red";
}
class animal extends small{
    String color="black";
}
class dog extends animal{
    String color="white";
     void printcolor(){
            System.out.println(color);
            System.out.println(super.color);
        }
}
public class in59{
    public static void main(String[] args){
        dog d1=new dog();
       d1.printcolor();
    }
}