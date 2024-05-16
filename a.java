public class a {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1,3, 4, 5, 6 };
        int check =0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                check = 1;
                break;
            }
        }
        if (check == 0) {
            System.out.println("Ascending order...");
        } else {
            System.out.println("Descending order...");
        }
    }
}