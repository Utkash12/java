class bank {
    int interest() {
        return 0;
    }
}

class icici extends bank{
    int interest() {
        return 6;
    }
}

class sbi extends bank{
    int interest() {
        return 8;
    }
}

class hdfc extends bank{
    int interest() {
        return 10;
    }
}

public class p33 {
    public static void main(String[] args) {
        sbi s = new sbi();
        icici i = new icici();
        hdfc h = new hdfc();
        System.out.println("SBI interest: " + s.interest());
        System.out.println("ICICI interest: " + i.interest());
        System.out.println("HDFC interest: " + h.interest());
    }
}