class dog {
    void barking() {
        System.out.println("Dog is barking...");
    }
}
class bigdog extends dog {
    void bark() {
        System.out.println("Big dog is barking...");
    }
}
public class p25 extends bigdog{
    public static void main(String[] args) {
        p25 w = new p25();
        w.bark();
        w.barking();
    }
}