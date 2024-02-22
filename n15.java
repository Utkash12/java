public class n15 {
    public static void main(String[] args) {
        int r = 5;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 1; i < r - 1; i++) {
            for (int j = r - 1; j > i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}