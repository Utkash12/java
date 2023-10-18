public class ll165 {
    public static void main(String[] args) {
        System.out.println("Enter the array");
        int[] arr={1,2,2,3,3,3,4,4,5,5,6,7,8,9};
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                arr[j]=arr[i];
                j++;
            }
            else{
                arr[i]=arr[i+1];
            }
        }
        arr[j]=arr[arr.length-1];
        for(int i=0;i<j;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
