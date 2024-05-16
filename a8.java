public class a8 {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 2, 3, 2, 4, 5, 2 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                count++;
            }
        }
        System.out.println("The number of count wil be: " + count);
    }
}