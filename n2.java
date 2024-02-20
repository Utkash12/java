import java.util.*;

public class n2 {
    public static void main(String[] args) {
        int r1 = 5;
        int c1 = 5;
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  *   ");
            }
            System.out.println("");
            for(int k=0;k<r1-1;k++){
                System.out.print("  *   ");
            }
        }
        for (int a = 0; a < r1; a++) {
            for (int b = c1 - 1; b > a - 1; b--) {
                System.out.print("  *   ");
            }
            System.out.println("");
        }
    }
}