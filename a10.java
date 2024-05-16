//smallest and largest number of array
public class a10 {
    public static void main(String[] args){
        int[] arr={1,4,2,3,7,5,6};
        int smallest=arr[0];
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("The smallest number is: "+smallest);
        System.out.println("The largest number is: "+largest);
    }
}
8429996221
