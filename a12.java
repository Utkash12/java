public class a12 {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4, 5 };
        int sum = 6;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == sum) {
                        System.out.println("The triplet will be " + arr[i] + " plus " + arr[j] + " plus " + arr[k]);
                    }
                }
            }
        }
    }
}