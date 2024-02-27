class adder {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class p30 {
    public static void main(String[] args) {
        adder a = new adder();
        System.out.println(a.add(2, 3));
        System.out.println(a.add(2, 3, 4));
    }
}