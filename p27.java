
class grandparent {
    void grandparent() {
        System.out.println("this is grandparent");
    }
}

class parent extends grandparent {
    void parent() {
        System.out.println("this is parent");
    }
}

class child extends parent {
    void child() {
        System.out.println("this is child");
    }
}

public class p27{
    public static void main(String[] args) {
        child c = new child();
        c.grandparent();
        c.parent();
        c.child();
    }
}