//prefix sum and sufix sum without using extra space
public class arr53 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int count=0;
        for(int i=0;i<arr.length;i++){
            count=count+arr[i];
            arr[i]=count;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"   ");
        }
        System.out.println(" ");
    }
}
