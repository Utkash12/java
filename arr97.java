public class arr97{
    public static void main(String[] args){
        int[] arr={1,2,34,45,56,67,78,89,90,92,95};
        int low=0;
        int key=90;
        int high=arr.length-1;
        int mid=(low+high)/2;
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
            System.out.println("Element not found..");
        }
    }
}