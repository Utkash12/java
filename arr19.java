public class arr19{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int[] arr2=arr;
        arr2[0]=100;
        arr[1]=200;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}