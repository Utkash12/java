public class n9 {
    public static void main(String[] args) {
        int r = 5;
        int c = 5;
        for (int i = 0; i < r; i++) {
            for (int j = r- 1; j > i; j--) {
                System.out.print("");
            }
            for (int k = 1; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}