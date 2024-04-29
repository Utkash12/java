public class p58 {
    public static void main(String[] args) {
        int[] arr = { 4, 54, 34, 11, 22, 76, 33, 111 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n -i- 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        // System.out.print(arr[n-1]);
    }
}