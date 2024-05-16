public class a9{
    public static void main(String[] args) {
        int[] arr = { 2, 1, 2, 3, 2, 4, 5, 2 };
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                idx = i;
            }
        }
        System.out.println("the last index will be: " + idx);
    }
}