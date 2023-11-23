//binary search
public class arr95{
    public static void main(String[] args){
        int[] arr={1,5,10,14,18,20,22,26,30,35,40,45,50,55,60,65,70,75,80,85,90};
        int key=55;
        int low=0;
        int high=arr.length-1;
        int mid=(low+high)/2;
        while(low<=high){
            if(arr[mid]==key){
                System.out.println("Element found at index "+mid);
                break;
            }
            else if(arr[mid]<key){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            mid=(low+high)/2;
        }
        if(low>high){
            System.out.println("Element not found");
        }
        
    }
}