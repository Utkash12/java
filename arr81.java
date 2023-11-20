public class arr81{
    public static void main(String[] args){
        int[] arr={1,12,23,34,45,56,67,78,89,90};
        int key=2;
        int flag=0;
        int low=0;
        int high=arr.length-1;
        int mid=(low+high)/2;
        while(low<=high){
            if(arr[mid]==key){
                flag=1;
                break;
            }
            else if(arr[mid]>key){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            mid=(low+high)/2;
        }
        if(flag==1){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
    }
}