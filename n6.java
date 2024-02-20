import java.util.*;

public class n6 {
    public static void main(String[] args) {
        int r = 5;
        int c = 5;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 0; i < r; i++) {
            for (int j = c - 1; j > i - 1; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}