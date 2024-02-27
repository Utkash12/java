class parent {
    void parent() {
        System.out.println("This is the parent class");
    }
}

class child1 extends parent {
    void child1() {
        System.out.println("This is the first child class");
    }
}

class child2 extends parent {
    void child2() {
        System.out.println("This is the second child class");
    }
}

public class p28 {
    public static void main(String[] args) {
        child2 c = new child2();
        child1 cc = new child1();
        c.child2();
        c.parent();
        cc.parent();
        cc.child1();
    }
}