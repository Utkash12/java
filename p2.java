public class p2 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        pat(5);
        pat1(5);
    }

    public static void pat(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
        }
        System.out.println("");
    }

    public static void pat1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j >i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
