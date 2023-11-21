//binary search
public class arr93{
    public static void main(String[] args){
        int[] arr={1,23,45,67,89,90,100};
        int low=0;
        int high=arr.length-1;
        int mid=(high+low)/2;
        int key=90;
        while(high>low){
            if(arr[mid]==key){
                System.out.println("Element found at index "+mid);
            }
            else if(key<arr[mid]){
                high=mid-1;
            }
            else if(key>arr[mid]){
                low=mid+1;
            }
            else{
                System.out.println("Element not found..");
                return;
            }
        }
    }
}