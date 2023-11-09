//second largest element in an array
public class arr28 {
    public static void main(String[] args) {
        int[] arr={1,7,5,3,9,10,2,3};
        int max=0;
        int secondmax=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondmax=max;
                max=arr[i];
            }
            else if(arr[i]>secondmax){
                secondmax=arr[i];
            }
        }
        System.out.println(secondmax);
    }
}
