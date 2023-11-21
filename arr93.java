//binary search
public class arr93{
    public static void main(String[] args){
        int[] arr={1,23,45,67,89,90,100};
        int low=0;
        int high=arr.length-1;
        int mid=(high+low)/2;
        int key=90;
        int flag=0;
        while(high>low){
            if(arr[mid]==key){
                flag=1;
            }
            else if(key<arr[mid]){
                high=mid-1;
            }
            else if(key>arr[mid]){
                low=mid+1;
            }
            else{
                flag=0;
            }
        }
        if(flag==1){
            System.out.println("Element found..");
        }
        else{
            System.out.println("Element not found..");
        }
    }
}