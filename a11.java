public class a11 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int sum = 6;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println("Sum of " + arr[i] + " & " + arr[j]+ " is equal to "+sum);
                }
            }
        }
    }
}