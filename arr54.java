public class arr54{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        int count=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+count;
            count=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}