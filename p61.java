public class p61{
    public static void main(String[] args) {
        int[] arr = { 95, 34, 63, 22, 15, 23, 65, 66, 44, 33, 22, 10 };
        int n = arr.length;
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "   ");
        }
    }
}