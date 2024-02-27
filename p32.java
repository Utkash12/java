class bank {
    int interst() {
        return 0;
    }
}

class sbi extends bank {
    int interst() {
        return 6;
    }
}

// class icici extends bank {
//     int interst() {
//         return 8;
//     }
// }

class hdfc extends bank {
    int interst() {
        return 10;
    }
}

public class p32 {
    public static void main(String[] args) {
        sbi s = new sbi();
        // icici i = new icici();
        hdfc h = new hdfc();
        System.out.println("SBI rate of interest will be: " + s.interst());
        // System.out.println("ICICI rate of interest will be: " + i);
        System.out.println("HDFC rate of interest will be: " + h.interst());
    }
}
