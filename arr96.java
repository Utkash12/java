public class arr96{
    public static void main(String[] args){
        int[] arr={1,5,10,11,16,20,21,27,30,35,39};
        int key=120;
        int low=0;
        int high=arr.length-1;
        int mid=(high+low)/2;
        while(low<=high){
            if(arr[mid]==key){
                System.out.println("Element found at index: "+mid);
                break;
            }
            else if(key<arr[mid]){
                high=mid-1;
            }
            else if(key>arr[mid]){
                low=mid+1;
            }
            mid=(low+high)/2;
        }
        if(low>high){
            System.out.println("Element not found");
        }
    }
}