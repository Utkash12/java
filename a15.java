//reverse an array without using another array
public class a15{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int temp=0;
        for(int i=0;i<arr.length/2;i++){
            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}