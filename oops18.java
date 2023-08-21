class student{
    private int roll;
    private float marks;
    private String address;
    
    public void setRoll(int r){
        this.roll=r;
    }
    public int getRoll(){
        return roll;
    }
    public void setMarks(float m){
        this.marks=m;
    }
    public float getMarks(){
        return marks;
    }
    public String setAddress(String a){
        this.address=a;
    } 
    public String getAddress(){
        return address;
    }
}
public class oops18{
    public static void main(String[] args){
        student rahul=new student();
        rahul.setRoll(18);
        rahul.setMarks(67.89f);
        rahul.setAddress("Krishna Nagar");
        System.out.println(rahul.getRoll());
        System.out.println(rahul.getMarks());
        System.out.println(rahul.getAddress());
    }
}