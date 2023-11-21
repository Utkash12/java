public class arr92{
    public static void main(String[] args){
        int[] arr={1,4,7,11,23,34,45,56,67,89};
        int low=0;
        int high=arr.length-1;
        int mid=(high+low)/2;
        int key=23;
        while(high>low){
            if(arr[mid]==key){
                System.out.println("Element found..");
                break;
            }
            else if(key<arr[mid]){
                low=mid-1;
            }
            else if(key>arr[mid]){
                low=mid+1;
            }
            else{
                System.out.println("Element not found..");
                break;
            }
        }

    }
}