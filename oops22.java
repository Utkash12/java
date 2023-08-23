class student {
    private String name;
    private int num;

    public void setName(String na) {
        this.name = na;
    }

    public void getName() {
        System.out.println(name);
    }

    public void setNumber(int n) {
        this.num = n;
    }

    public void getNumber() {
        System.out.println(num);
    }
}
public class oops22 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setName("Akash");
        s1.getName();
        s1.setNumber(123);
        s1.getNumber();
    }
}