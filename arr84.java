public class arr84 {
    public static void main(String[] args) {
        int[] arr = { 1, 34, 56, 22, 44, 89, 2, 54, 66, 77 };
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length -i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1]; // c=a
                    arr[j + 1] = arr[j]; // a=b
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "   ");
        }
    }
}