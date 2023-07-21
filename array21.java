import java.util.Arrays;

public class array21 {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 2, 4, 2, 5};

        // Remove twos from the array and get the new array without twos
        int[] newArray = removeTwos(originalArray);

        // Print the original and new array for verification
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("New Array without Twos: " + Arrays.toString(newArray));
    }

    public static int[] removeTwos(int[] arr) {
        // Count the number of occurrences of 2 in the original array
        int count = 0;
        for (int num : arr) {
            if (num == 2) {
                count++;
            }
        }

        // Create a new array with size = original array size - count of twos
        int[] newArray = new int[arr.length - count];

        int newIndex = 0;
        for (int num : arr) {
            // Copy all elements except for the number 2 to the new array
            if (num != 2) {
                newArray[newIndex] = num;
                newIndex++;
            }
        }

        return newArray;
    }
}
