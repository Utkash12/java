// creating a clone of array
public class a7{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int[] arr2=arr.clone();
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        arr2[0]=100;
        System.out.println();
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}