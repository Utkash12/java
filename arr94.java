public class arr94{
    public static void main(String[] args) {
        int[] arr = { 1, 2, 9, 5, 3, 7, 6 };
        int key = 4;
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Element not found..");
        } else {
            System.out.println("Element found..");
        }
    }
}