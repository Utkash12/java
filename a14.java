//second largest number of array
public class a14{
    public static void main(String[] args){
        int[] arr={1,5,4,2,8,6,9};
        int max=arr[0];
        int secondmax=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondmax=max;
                max=arr[i];
            }
            else if(arr[i]>secondmax){
                secondmax=arr[i];
            }
        }
        System.out.println("Second largest number is: "+secondmax);
    }
}