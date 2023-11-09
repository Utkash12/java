public class arr29{
    public static void main(String[] args){
        int[] arr={1,2,3,7,5,4,6,8,9,10};
        int max=0;
        int secmax=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secmax=max;
                max=arr[i];
            }
            else if(secmax<arr[i]){
                secmax=arr[i];
            }
        }
        System.out.println(secmax);
    }
}