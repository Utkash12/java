class student{
    private int roll;
    private float marks;
    private String address;
    
    public void setRoll(int r){
        if(r<=0){
            System.out.println("Invalid Roll Number");
            return;
        }
        this.roll=r;
    }
    public int getRoll(){
        return roll;
    }
    public void setMarks(float m){
        if(m<0){
            System.out.println("Invalid Marks");
            return;
        }
        this.marks=m;
    }
    public float getMarks(){
        return marks;
    }
    public void setAddress(String a){
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